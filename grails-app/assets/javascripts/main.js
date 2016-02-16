angular.module('amsApp', ['ui.router'])

    .config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise('/home');

        $stateProvider

            .state('home', {
                url: '/home',
                templateUrl: 'partials/home.html'
            })


            .state('practice', {
                url: 'practice',
                templateUrl: 'pms/practice/list.html',
                controller: 'practiceListCtrl'

            })
    })











