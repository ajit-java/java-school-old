
phonecatControllers.controller('home', ['$scope', '$http',
    function ($scope, $http) {

        $scope.title = 'this is home page';
    }]);

phonecatControllers.controller('about', ['$scope', '$routeParams',
    function($scope, $routeParams) {

        $scope.title = 'this is about page';
    }]);