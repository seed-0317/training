# controllers
* functionality for views
* instantiated every time it's needed

### define a module

```
angular.module("DogModule", []);
```

### define a controller

```
angular.module("DogModule").controller("CatController", function() {

});
```

### Using `$scope` in a controller
* notice the **dependency injection**

```
angular.module("DogModule").controller("CatController", function($scope) {

  $scope.count = 0;

  $scope.increment = function() {
    $scope.count++;
  }

});
```

```
<html data-ng-app="DogModule">



  <div data-ng-controller="CatController">

  	<h3>{{count}}</h3>

    <button data-ng-click="increment()">Increment!</button>

  </div>
```


### Using **Controller as** syntax

```
angular.module("DogModule").controller("CatController", function() {

  this.count = 0;

  this.increment = function() {
    this.count++;
  }

});
```

```
<html data-ng-app="DogModule">



  <div data-ng-controller="CatController as cat">

  	<h3>{{cat.count}}</h3>

  	<button data-ng-click="cat.increment()">Increment!</button>

  </div>
```

# Further reading
* [Digging into Angular's "Controller as" syntax](https://toddmotto.com/digging-into-angulars-controller-as-syntax/)
