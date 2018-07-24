'use strict';
angular.module('view.home', [])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/home', {
      templateUrl: 'views/partial/home/home.html',
      controller: 'HomeController'
    })
  }])
  .controller('HomeController', ['$scope', '$location', function ($scope, $location) {

    /**
     * Method to clear local storage on home page load.
     */
    $scope.$on('$viewContentLoaded', function(){
      
      localStorage.removeItem("currentUser");
      localStorage.removeItem("userSelections");

    });
    

  }])