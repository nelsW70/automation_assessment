angular.module('controller.global', [])

    .controller('GlobalController', ['$scope', '$rootScope', function ($scope, $rootScope) {

        $scope.bodyClass = 'bg';

        $scope.header = "Automation Assessment";

        $scope.headerImage = "assets/images/svg/sdlc_2blue_Logo.svg";

        $scope.thankYouMessage = "Thanks for submitting!";

        $scope.copyRightText = "2018 SDLC Partners, L.P.";

        $scope.questionErrorMessage = "Please select at least one checkbox";
    
        $rootScope.$on("pageChanged", function (evt, current, previous) {
            let classBG = ["/home", "/contact-info"];

            if (classBG.includes(current.$$route.originalPath)) {
                $scope.bodyClass = 'bg';
            } else{
                $scope.bodyClass = 'bg-two';
            }
        });
    }]);