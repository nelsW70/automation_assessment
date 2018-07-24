'use strict';

// Declare app level module which depends on views, and components
angular.module('assessment-app', [
    'ngRoute',
    'controller.global',
    'view.home',
    'view.contact-info',
    'view.start',
    'view.question',
    'view.report',
    'service.assessmentservice'
  ])
  .config(['$locationProvider', '$routeProvider', function ($locationProvider, $routeProvider) {
    $routeProvider.otherwise({
      redirectTo: '/home'
    });
  }])
  .run(['$rootScope', function ($rootScope) {
    $rootScope.$on('$routeChangeSuccess', function ($event, current, previous) {
      if (undefined !== current && undefined !== current.$$route) {
        $rootScope.$broadcast("pageChanged", current, previous);
      }
    });
  }])
