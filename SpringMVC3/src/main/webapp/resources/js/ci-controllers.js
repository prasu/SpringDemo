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
    	
    	$scope.getPerformanceData = function() {
    		var formData = {
					"fromDate" : $scope.fromDate,
					"toDate" : $scope.toDate
			};
    	        
        $http({method: 'POST', url: 'performanceData.do',data: formData}).
        success(function(data, status, headers, config) {
            $scope.perfData = data;
        }).
        error(function(data, status, headers, config) {
          // called asynchronously if an error occurs
          // or server returns response with an error status.
        });      
    	};
                
    });
    
