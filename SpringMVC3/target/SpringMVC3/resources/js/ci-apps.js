angular.module('ciApp', [])
    .config(['$routeProvider',function ($routeProvider) {
        $routeProvider
            .when('/home', {
                controller: 'HomeController',
                templateUrl: '/SpringMVC3/resources/pages/views/home.html'
            })
            .when('/perfdata', {
                controller: 'PerfController',
                templateUrl: '/SpringMVC3/resources/pages/views/perf.html'
            })            
            .otherwise({
                redirectTo: '/home'   
            });        
    }]);
    
