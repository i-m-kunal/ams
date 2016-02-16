angular.module('amsApp', ['ui.router'])

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
            .state('practice', {
                url: 'practice',
                templateUrl: 'pms/practice/home.html',
                controller: 'practiceListCtrl'

            })
    })











