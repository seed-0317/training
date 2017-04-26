/**
 * controllers.js
 * 
 * All my Angular Controllers
 * 
 * @author Taylor Kemper
 */

angular.module("DogModule").controller("HomeCtrl", function($state) {
	
	var home = this;
	
	var secretLights = [
		{text: 'Ready!', color: 'label-danger'},
		{text: 'Set!', color: 'label-warning'},
		{text: 'Wait start over...', color: 'label-danger'},
		{text: 'Ready!', color: 'label-danger'},
		{text: 'Set!', color: 'label-warning'}
	];
	
	var currIndex = 0;
	
	home.lights = [];
	
	home.pleaseGo = function() {
		
		if(currIndex < 5) {
			home.lights[currIndex] = secretLights[currIndex];
			currIndex++;
		} else {
			$state.go('go');	
		}
	}
	
});
