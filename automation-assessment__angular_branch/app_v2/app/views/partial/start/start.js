'use strict';
angular.module('view.start', [])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/start', {
      templateUrl: 'views/partial/start/start.html',
      controller: 'StartController'
    })
  }])
  .controller('StartController', ['$scope', '$location', function ($scope, $location) {
    console.log('Start controller loaded');

    $scope.startAssessmentQuestion = function (param) {
      $location.path('/question').search({
        selection: param,
        question: 1
      });
    };

  }]);