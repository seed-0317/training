# directives
* extend HTML
* Can use as **tags**, **attributes**, comments, css classes
* Angular directives are prefixed with `ng-` (because it sounds like Angular)
  * `ng-app`
  * `ng-model`
  * `ng-repeat`
  * `ng-click`
  * `ng-submit`
* HTML5 says if we want to use custom tags, elements, etc. we have to prefix them with `data-`
  * `data-ng-app`
  * `data-ng-model`
* You can create directives
  * Don't prefix them with `ng-`
  * Defining `myBaseballCard`
  * Using `my-baseball-card`

# Important directives
* `ngApp` auto-bootstrap an Angular application
* `ngModel` binds an **input**, **select**, or **textarea** (or custom form control) to a property on the scope
* `ngRepeat` instantiates a template once per item from a collection. Each template instance gets its own scope

[API Reference](https://docs.angularjs.org/api/ng/directive)
