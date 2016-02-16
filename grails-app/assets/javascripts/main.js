angular.module('amsApp', ['ui.router'])

    .config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise('/home');

        $stateProvider


            .state('home', {
                url: '/home',
                templateUrl: 'ams/home.html'
            })


            .state('practice', {
                url: 'practice',
                templateUrl: 'pms/practice/list.html',
                controller: 'practiceListCtrl'

            })
    })











