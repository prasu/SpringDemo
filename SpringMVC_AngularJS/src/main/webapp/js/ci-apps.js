angular.module('ciApp', [])
    .config(['$routeProvider',function ($routeProvider) {
        $routeProvider
            .when('/home', {
                controller: 'HomeController',
                templateUrl: 'views/home.html'
            })
            .when('/perfdata', {
                controller: 'PerfController',
                templateUrl: '/SpringMVC_AngularJS/performanceData.html'
            })            
            .otherwise({
                redirectTo: '/home'   
            });        
    }]);
    
