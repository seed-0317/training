# scope
* `$scope` is an Angular service
* single source of truth
* data (key value pairs)
* tree of scopes with **rootScope** at the top
* how **views** and **controllers** talk to each other
* two way data binding
  * if a view changes something in scope, then the controller sees the change
  * vice versa


### expressions
* evaluate arithmetic

```
{{4+3}}
```

* evaluate data in scope
  * If scope has a key **name**

```
Hello {{name}}
```

### Note
* Chrome extension: [Angular Batarang](https://chrome.google.com/webstore/detail/angularjs-batarang/ighdmehidhipcmcojjgiloacoafjmpfk?hl=en)
* [JSFiddle](https://jsfiddle.net/)
* [JSFiddle AngularJS template](http://jsfiddle.net/joshdmiller/HB7LU/)
