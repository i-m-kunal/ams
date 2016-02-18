angular.module('amsApp', ['ui.router', 'ngResource'])

    .config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise('/home');

        $stateProvider


            .state('home', {
                url: '/home',
                templateUrl: 'ams/ticket/home.html'
            })

            .state('ticket', {

                url: 'ticket',
                templateUrl: 'ams/ticket/home.html'
            })

            .state('ticket.list', {
                url: '/list',
                templateUrl: 'ams/ticket/list.html'
 
            })
            .state('item', {
                url: 'item',
                templateUrl: 'pms/practice/home.html',
                controller: 'practiceListCtrl'

            })
    });


angular.module('amsApp').factory('LoggedInUser', ['$http', '$resource', function ($http, $resource) {
    return $resource('/dashboard/fetchLoggedInUser', {}, {
        get: {method: 'GET'}
    })

}]);


angular.module('amsApp').service('dataService', function () {
    var user;
    var editable;

    this.setEditable = function (value) {
        editable = value;
    };

    this.getEditable = function () {
        return editable
    };

    this.setUser = function (value) {
        user = value
    };
    this.getUser = function () {
        return user
    };
});


angular.module('amsApp').controller('homeCtrl', ['$scope', '$state', '$http', '$window', '$location', 'dataService', 'LoggedInUser',
    function ($scope, $state, $http, $window, $location, dataService, LoggedInUser) {
        $scope.selectedItem = 'All';

        LoggedInUser.get(function (data) {

            this.user = data.user;
            this.isAdmin = data.user.authority.indexOf("ROLE_ADMIN") >= 0;
            console.log("is admint:" + this.isAdmin)


            if (this.isAdmin) {
                dataService.setEditable(true);
                //  $state.go("bootcampList");
            }
            else {
                dataService.setEditable(false);
                this.go("userDashBoard");
            }
            dataService.setUser(data.user);
        });


    }]);











