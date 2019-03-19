var app = angular.module('app', []);
app.controller('topicController', function($scope, $http, $location) {
	
	$scope.newTopicFlag = 0;
	$scope.allTopicFlag = 0;
	$scope.newEditFlag = 0;
	$scope.addNewTopic = function(){
		var url = $location.absUrl() + "topics";
		
		var config = {
                headers : {
                    'Accept': 'application/json'
                }
        };
		var topic = {
				id: $scope.topicID,
				name: $scope.topicName,
				description: $scope.description
        };
		
		$http.post(url, topic, config).then(function (response) {
			$scope.clearAll();
			$scope.postResultMessage = response.data;
			
		}, function error(response) {
			$scope.postResultErrorMessage = "Error:Something went wrong.";
		});
		
	},
	$scope.getAllTopics = function(){
		$scope.newTopicFlag = 0 ;
		$scope.allTopicFlag = 1;
		$scope.newEditFlag = 0 ;
		var url = $location.absUrl() + "topics";
		
		$http.get(url).then(function (response) {
			$scope.response = response.data
		}, function error(response) {
			$scope.postResultErrorMessage = "Error:Something went wrong.";
		});
	},
	$scope.loadTopicsByID = function(id){	
		$scope.newTopicFlag = 1 ;
		$scope.newEditFlag = 1 ;
		$scope.clearAll();
		$scope.topicID = $scope.response[id].id;
		$scope.topicName = $scope.response[id].name;
		$scope.description = $scope.response[id].description;
	},
	$scope.updateTopicsByID = function(){	
		var url = $location.absUrl() + "topics";
		var config = {
                headers : {
                    'Accept': 'application/json'
                }
        };
		var topic = {
				id: $scope.topicID,
				name: $scope.topicName,
				description: $scope.description
        };
		
		$http.put(url,topic,config).then(function (response) {
			$scope.clearAll();
			$scope.postResultMessage = response.data;
			$scope.getAllTopics();
			$scope.newTopicFlag = 0 ;
		}, function error(response) {
			$scope.postResultErrorMessage = "Error:Something went wrong.";
		});
	},
	$scope.deleteTopicByID = function(id){
		var url = $location.absUrl() + "topics/"+id;
				
		$http.delete(url).then(function (response) {
			$scope.clearAll();
			$scope.postResultMessage = "Deleted Successfully..";
			$scope.getAllTopics();
			$scope.newEditFlag = 0 ;
		}, function error(response) {
			$scope.postResultErrorMessage = "Error:Something went wrong.";
		});

		
		
	},
	$scope.clearAll = function(id){	

		$scope.topicID = "";
		$scope.topicName = "";
		$scope.description = "";
		$scope.postResultMessage = "";
		$scope.postResultErrorMessage = "";
		
	}
	
});

