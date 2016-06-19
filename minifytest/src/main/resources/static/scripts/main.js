var angApp = angular.module("angApp", ['ngRoute','phonecatControllers']);
angApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/', {
                templateUrl: 'html/home.html',
                controller: 'home'
            }).
            when('/about', {
                templateUrl: 'html/about.html',
                controller: 'about'
            }).
            otherwise({
                redirectTo: '/phones'
            });
    }]);

var phonecatControllers = angular.module('phonecatControllers', []);

