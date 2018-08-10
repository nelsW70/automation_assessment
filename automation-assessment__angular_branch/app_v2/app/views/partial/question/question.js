'use strict';
angular.module('view.question', [])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/question', {
      templateUrl: 'views/partial/question/question.html',
      controller: 'QuestionController'
    })
  }])
  .controller('QuestionController', ['$scope', '$location','$timeout', 'AssessmentService', function ($scope, $location,$timeout, AssessmentService) {
    
    console.log('Question controller loaded.');

    var userSelection;

    /**
     * Default Question Number
     */
    $scope.questionNo = 1;
    
    /**
     * Variable for LastQuestion
     */
    $scope.isLastQuestion = false;

    /**
     * Checkbox Model Default
     */
    $scope.answers = {
      selected: {}
    };

    /**
     * View on Init
     */
    $scope.onInit = function () {

      // Read Query Parameter from URL
      var queryParameterObj = $location.search();
      if (typeof queryParameterObj !== 'undefined') {

        // Read Type of Questions: Yes/No
        userSelection = queryParameterObj.selection;

        // Read Question Number
        $scope.questionNo = queryParameterObj.question;

        // If Valid URL
        if (typeof userSelection !== 'undefined' && typeof $scope.questionNo !== 'undefined') {
          try {

            //if prev is clicked on first Question, Redirect to Start Screen
            if ($scope.questionNo == 0) {
              $location.path('/start').search({
                selection: null,
                question: null
              });
              return;
            }

            // Get Question# from Service
            $scope.questionObj = AssessmentService.getQuestion(userSelection, $scope.questionNo);

            // Get Total Number of Questions (For Pagination)
            $scope.totalQuestions = AssessmentService.getQuestionsLength(userSelection);

            // Get User Selection if Already Answered
            var userSelections = localStorage.getItem("userSelections");

            // First Time
            if(undefined == userSelections){
              $scope.userSelection={};
            }else{
              // Get User Selection
              $scope.userSelection = JSON.parse(userSelections);

              // If Question is already answered
              if($scope.userSelection.hasOwnProperty($scope.questionNo)){
                  // Set the Scope Answers
                  $scope.answers = $scope.userSelection[$scope.questionNo];
                  console.log($scope.answers);
              }
            }

            // If Last Question, Set is Last Question: True
            if ($scope.questionNo == $scope.totalQuestions) {
              $scope.isLastQuestion = true;
            }
          } catch (e) {
            // Invalid Question Request
            console.error(e);
            $location.path('/').search({
              selection: null,
              question: null
            });
          }
        } else {
          // Invalid URL
          console.error("Invalid Parameters!");
          $location.path('/').search({
            selection: null,
            question: null
          });
        }
      }
    }

    /**
     * Method to get Store Current Question Answer and Redirect to Next Page
     */
    $scope.nextQuestion = function () {

      // Check if atleast One Answer is Selected
      if(isAnswerValid()){

        // Store Selection in LocalStorage
        $scope.storeAnswer();

        // Increment Question Number
        let nextQuestionNo = ++$scope.questionNo;

        // Redirect to Next Question
        $location.path('/question').search({
          selection: userSelection,
          question: nextQuestionNo
        });
     }

    }

    /**
     * Method to Store Curruent Question Answer and Redirect to Previous Page
     */
    $scope.prevQuestion = function () {

      // Check if atleast One Answer is Selected
      if(isAnswerValid()){

        // Store Selection in LocalStoage
        $scope.storeAnswer();

        // Decrement Question Number
        let prevQuestionNo = --$scope.questionNo;

        // Redirect to Previous Question
        $location.path('/question').search({
          selection: userSelection,
          question: prevQuestionNo
        });
      }
    }

    /**
     * Submit Assessment
     */
    $scope.submitQuestion = function () {
      
      // Check if atleast One Answer is Selected
      if(isAnswerValid()){

        // Store Selection in Local Storage
        $scope.storeAnswer();

        // Show Thank You Message
        var x = document.getElementById("snackbar-thanks");
        x.className = "show";

        //Hide Thank You Message and Redirect to Reports Page after 5 Seconds
        $timeout(function(){ 
          x.className = x.className.replace("show", "");
          $location.path('/report').search({
            selection: userSelection,
            question: null
          });
         
       }, 5000);
      }
    }

    /**
     * Method to Store User Selection into Local Storage
     */
    $scope.storeAnswer = function(){
      $scope.userSelection[$scope.questionNo] =  $scope.answers;
      localStorage.setItem("userSelections",JSON.stringify($scope.userSelection));
    }

    /**
     * Method to Handle Checkbox Click Event
     * 
     * @param {M} question 
     * @param {*} option 
     */
    $scope.handleClick = function(question,option){

      // If Type of Question is Single Select
      if('single-select'=== question.type){
         $scope.answers.selected = {};
      }

      // Show other text box input is there any linked property for Checkbox
      if(undefined != option.linkedTo){
        $scope.answers[option.linkedTo] = undefined;
        $('.othertext-'+option.linkedTo).toggle('fast');
       }
    }

    /**
     * Method to Check if Atleast One Answer is Selected
     */
    var isAnswerValid = function(){
      var answerLen = Object.keys($scope.answers.selected).length;
      if (answerLen === 0){
        // If No Answer is selected show the Error Message
        showErrorMessage();
        return false;
      }
      return true;
    }

    /**
     * Method to show Error Message
     */
    var showErrorMessage = function() {
      var x = document.getElementById("snackbar");
      x.className = "show";
      
      // Hide Error Message After 5 Seconds
      $timeout(function(){ x.className = x.className.replace("show", "");
    }, 5000);
    }

  }]);
