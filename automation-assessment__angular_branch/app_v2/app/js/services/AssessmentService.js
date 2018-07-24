angular.module('service.assessmentservice', [])

  .service('AssessmentService', function () {
    
    console.log('Assessment Service Loaded.');

    /**
     * Method to return Question of selection (Yes/No) and Question#
     * 
     * @param {*} selection 
     * 
     * @param {*} questionNo 
     * 
     * return Question Number
     */
    this.getQuestion = function (selection, questionNo) {
      if (selection === 'yes') {
        sort(questionsYes);
       if (questionNo <= questionsYes.length && questionNo > 0) {
          return questionsYes[questionNo - 1];
        } else {
          throw new Error("Question Not Found.");
        }
      } else if (selection === 'no') {
        sort(questionsNo);
        if (questionNo <= questionsNo.length && questionNo > 0) {
          return questionsNo[questionNo - 1];
        } else {
          throw new Error("Question Not Found.");
        }
      }
    }

    /**
     * Method to get Total Question Length
     */
    this.getQuestionsLength = function (selection) {
      if (selection === 'yes') {
        return questionsYes.length;
      } else if (selection === 'no') {
        return questionsNo.length;
      }
    }

    /**
     * Method to get Question Text from Text ID
     * 
     * @param {*} selection 
     * @param {*} questionId 
     */
    this.getQuestionText = function(selection, questionId){
      if (selection === 'yes') {
        sort(questionsYes);
        return questionsYes[questionId-1].question;
      } else if (selection === 'no') {
        sort(questionsNo);
        return questionsNo[questionId-1].question;
      }

    }
    
    /**
     * Method to get Option Text from Option ID
     * @param {*} selection 
     * @param {*} questionId 
     * @param {*} optionId 
     */
    this.getOptionText = function(selection, questionId, optionId){

      if (selection === 'yes') {
        sort(questionsYes);
        return questionsYes[questionId-1].options[optionId-1].text;
      } else if (selection === 'no') {
        sort(questionsNo);
        return questionsNo[questionId-1].options[optionId-1].text;
      }

    }

    /**
     * Method returns of Option is linked to other field
     * 
     * @param {*} selection 
     * @param {*} questionId 
     * @param {*} optionId 
     */
    this.hasLinkedToOption = function(selection, questionId, optionId){

      if (selection === 'yes') {
        sort(questionsYes);
        return questionsYes[questionId-1].options[optionId-1].linkedTo;
      } else if (selection === 'no') {
        sort(questionsNo);
        return questionsNo[questionId-1].options[optionId-1].linkedTo;
      }

    }
    
    /**
     * Method to Sort Questions by Priority
     * 
     * @param {*} questions 
     */
    var sort = function(questions){
      questions.sort(function(a, b){
          return a.priority-b.priority;
      })
    }
  });