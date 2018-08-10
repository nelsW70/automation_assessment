'use strict';
angular.module('view.contact-info', [])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/contact-info', {
      templateUrl: 'views/partial/contact-info/contact-info.html',
      controller: 'ContactInfoController'
    })
  }])
  .controller('ContactInfoController', ['$scope', '$location', function ($scope, $location) {
    
    console.log('Contact Info controller loaded');
    
    // Contact-Info Form Model
    $scope.contactInfo = {
        firstName : "",
        lastName  : "",
        email     : "",
        phone     : "",
        address   : "",
        city      : "",
        zip       : ""
    }

    /**
     * Method to store infor in local storage and redirect to Start Screen
     */
    $scope.submit = function(){
        localStorage.setItem("currentUser",JSON.stringify($scope.contactInfo));
        $location.path('/start')
    }

    /**
     * Method to handle phone formatting.
     * 
     * @param {*} $event 
     */
    $scope.onPhoneKeyUp = function ($event) {
        var phone = $scope.contactInfo.phone;
        var charCode = $event.keyCode;
        $scope.contactInfo.phone = phoneFormat(phone);
    }

    /**
     * Method to format Phone number
     * @param {*} input 
     */
    var phoneFormat = function(input){
        // Strip all characters from the input except digits
        input = input.replace(/\D/g,'');

        // Trim the remaining input to ten characters, to preserve phone number format
        input = input.substring(0,10);

        // Based upon the length of the string, we add formatting as necessary
        var size = input.length;
        if(size == 0){
                input = input;
        }else if(size < 4){
                input = '('+input;
        }else if(size < 7){
                input = '('+input.substring(0,3)+') '+input.substring(3,6);
        }else{
                input = '('+input.substring(0,3)+') '+input.substring(3,6)+'-'+input.substring(6,10);
        }
        return input;
}

  }]);