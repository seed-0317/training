/**
 * app.js 
 * 
 * DogModule configuration and routing
 * 
 * @author Taylor Kemper
 */

var app = angular.module("DogModule", ['ui.router']);

app.config(function($stateProvider, $urlRouterProvider) {
	
	var helloState = {
		name: 'home',
		url: '/',
		templateUrl: 'templates/home.html',
		controller: 'HomeCtrl'
	};
	
	var aboutState = {
		name: 'about',
		url: '/about',
		templateUrl: 'templates/about.html',
		controller: 'AboutCtrl'
	};
	
	$stateProvider.state(helloState);
	$stateProvider.state(aboutState);
	
	//default routing
	$urlRouterProvider.otherwise('/');
	
});

