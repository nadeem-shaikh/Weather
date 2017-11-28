'use strict';

var App = angular.module('app', []);

App.controller('WeatherController', [ '$scope', '$http',
		function($scope, $http) {
			$scope.checkWeather = function() {
				var tempIn = 'c';
				$http({
					method : 'GET',
					url : 'findWeather?city=' + $scope.city.city,
					dataType : 'json',
					headers : {
						'Content-Type' : 'application/json'
					},

				}).then(function(response) {
					$scope.data = response.data;
				}, function(errResponse) {
					console.error('Error while fetching Weather');
					return $q.reject(errResponse);
				});
			}
			$scope.getCities = function() {
				$http({
					method : 'GET',
					url : 'cities',
					dataType : 'json',
					headers : {
						'Content-Type' : 'application/json'
					},

				}).then(function(response) {
					$scope.cities = response.data;
					if($scope.cities.length > 0){
						$scope.city = $scope.cities[0];
						$scope.checkWeather($scope.city);
					}
				}, function(errResponse) {
					console.error('Error while fetching cities');

				});
			}
			$scope.getCities();
		} ]);