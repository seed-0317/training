# services
* reusable logic
* wired together using dependency injection

### types
* service
* provider
* factory

### notes
* yes, there is a service service
* they're each a little different in how you create them and where you can use them

### service service
* this is the one we'll use
* lazily instantiated
* singleton

### create your own service

```
angular.module("DogModule").service("MyAwesomeService", function() {

});

```

### inject service into controller

```
angular.module("DogModule").controller("CatController", function(MyAwesomeService) {

});
```

### built in services
* **public** built in services start with `$`
* **private** built in services start with `$$`
* examples
  * `$scope`
  * `$http`

### `$http` example
* Each of the following three examples do the same thing

```
$http({
  method:"GET",
  url:"https://pokeapi.co/api/v2/pokemon/" + input + "/"
}).then(function(response){
  console.log("success");
}, function(response){
  console.log("failure");
});
```

```
var promise = $http({
  method:"GET",
  url:"https://pokeapi.co/api/v2/pokemon/" + input + "/"
});

promise.then(function(response){
  console.log("success");
}, function(response){
  console.log("failure");
});
```

```
var promise = $http({
  method:"GET",
  url:"https://pokeapi.co/api/v2/pokemon/" + input + "/"
});

promise.then(someSuccessFunction, someFailureFunction);
```
