# routing
* How we create SPA with Angular
* Angular's built in routing **ngRoute** lacks some key features
* We will use [ui-router](https://ui-router.github.io/)

### Example

```
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

});
```

placeholder for template

```
<ui-view></ui-view>
```
