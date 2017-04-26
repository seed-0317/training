/**
 * app.js 
 * 
 * DogModule configuration and routing
 * 
 * @author Taylor Kemper
 */

var app = angular.module("DogModule", ['ui.router', 'ui.bootstrap']);

app.config(function($stateProvider, $urlRouterProvider) {

	$stateProvider
		.state('home', {
			url: '/',
			templateUrl: 'templates/home.html',
			controller: 'HomeCtrl as home'
		})
		.state('go', {
			url: '/go',
			templateUrl: 'templates/go.html'
		});
	
	
	//default routing
	$urlRouterProvider.otherwise('/');
	
});

