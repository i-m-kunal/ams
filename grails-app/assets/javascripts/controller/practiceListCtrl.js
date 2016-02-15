angular.module('pmsApp')

    .controller('practiceListCtrl', function ($scope, $http) {

        $http.get('/practice/index').success(function (data) {
            $scope.practices = data;
        });

    })
