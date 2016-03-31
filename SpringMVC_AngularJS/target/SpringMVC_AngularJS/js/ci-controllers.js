angular.module('ciApp')
    .controller('HomeController', function ($scope) {
    	$scope.ci = {
    		      data: "DEMO Performance Data",    		      
    		      Data: function() {
    		         var ciObject;
    		         ciObject = $scope.ci;
    		         return ciObject.data;
    		      }
        };
    })
    .controller('PerfController', function ($scope,$http) {      
        $scope.headData = {
  		      client: "eBiz",    		      
  		      layer: "Spring",
  		      totalTime: "45ms"
      };
        $http.get('/performanceTableData').success(function(response){
            $scope.todos = response;
        }).error(function() {
            $scope.setError('Could not display all todos');
        });        
    });
    
