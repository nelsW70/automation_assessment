'use strict';
angular.module('view.report', [])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/report', {
      templateUrl: 'views/partial/report/report.html',
      controller: 'ReportController'
    })
  }])
  .controller('ReportController', ['$scope', '$location', 'AssessmentService', function ($scope, $location, AssessmentService) {

    /**
     * On View Init
     */
    $scope.onInit = function (){

       $scope.questions = [];
        // Read Query Parameter from URL
        var queryParameterObj = $location.search();

        // Read Type of Questions from Query Param Object: Yes/No
        let assessmentSelection = queryParameterObj.selection;

        // Read User Data from LocalStorage
        var userData = localStorage.getItem("currentUser");

        // Read User Selection Data from LocalStorage
        var userSelections = localStorage.getItem("userSelections");

        // If User Data Not Present in Local Storage then redirect to home
        if (undefined == userData || undefined == userSelections){
            console.error("Session over!");
            $location.path("/home");
        }

        // Parse User Data from JSON String
        $scope.user = JSON.parse(userData);
        var parsedUserSelections = JSON.parse(userSelections);
        
        // Format Questions for Report
        // For each Questions
        Object.keys(parsedUserSelections).forEach(function(questionNo) {
            let question = {};

            // Get Question Text from Question Number
            question.text = AssessmentService.getQuestionText(assessmentSelection, questionNo);
            
            let questionObj = parsedUserSelections[questionNo];
            let options = [];
            // For Each Selected Options
            Object.keys(questionObj.selected).forEach(function(option){
              if(questionObj.selected[option] != false){
                // Check if Option is Linked to Text
                let linkedTo = AssessmentService.hasLinkedToOption(assessmentSelection, questionNo, option)
                if(undefined != linkedTo){
                  // Get Text Value and Format it.
                  let otherOptionText = AssessmentService.getOptionText(assessmentSelection, questionNo, option);
                  let otherOptionValue = questionObj[linkedTo];
                  let formattedAnswer = otherOptionText +": " +otherOptionValue;
                  options.push(formattedAnswer);
                  
                }else{
                  // Get Option Text from Option Id
                  options.push(AssessmentService.getOptionText(assessmentSelection, questionNo, option));       
                }
              }
            })// End of For Each Selected Options
            question.selectedAnswers = options;
            // Add Question to Scope Array
            $scope.questions.push(question);
       })//End of For Each Questions

       $scope.createSummary(parsedUserSelections);

    }

    /**
     * Method to create Summary from Business Rules
     * 
     * @param {*} userSelections 
     */
    $scope.createSummary = function(userSelections){
      
      $scope.matchedRule = {};
      // For Each Rules
      for (let i = 0 ; i < rules.length; i++){
          let rule = rules[i];
          let ruleMatched = false;
          let breakCondition = false;

          // For Each Rule Answers
          Object.keys(rule.answers).forEach(function(answerObj){
             if(!breakCondition){

                // Get Rule Answer
                var ruleAns = rule.answers[answerObj];

                // Get User Answer for Same Question
                var userAnswers = Object.keys(userSelections[answerObj].selected);
                
                // Default Match = False
                ruleMatched = false;

                // For Each User Answer, Check Present in Rule Answer
                for(var userAnswer in userAnswers){
                  // Consider only not False inputs
                  if(userSelections[answerObj].selected[userAnswer] == false){
                    continue;
                  }
                  
                  // If Atleast one User Input Matches then set RuleMatched=true
                  if(ruleAns.includes(parseInt(userAnswers[userAnswer]))){
                      ruleMatched = true;
                      break;
                  }      
                }
            }
             // If User Answer is not Matched, then Break the rule Answers loop
             if(!ruleMatched){
               breakCondition = true;
             }
          
          })

          // If All Rules matched then breaks rules loop
          if(ruleMatched){
            console.log("Rule Matched.", rule.answers, userSelections);

            //assign matched rule to the scope.
            $scope.matchedRule = rule;
            break;
          }
      }
    }
  }])