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
			templateUrl: 'templates/home/home.html'
		})
		.state('about', {
			url: '/about',
			templateUrl: 'templates/about/about.html'
		})
		.state('about.life', {
			url: '/life',
			templateUrl: 'templates/about/1.html'
		})
		.state('about.liberty', {
			url: '/liberty',
			templateUrl: 'templates/about/2.html'
		})
		.state('about.happiness', {
			url: '/happiness',
			templateUrl: 'templates/about/3.html'
		});
	
	
	//default routing
	$urlRouterProvider.otherwise('/');
	
});

