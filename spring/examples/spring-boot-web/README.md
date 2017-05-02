# Spring Boot Web
* simple spring boot web application
* packaged as a `jar`
* java config - no more xml

### Create the project yourself
* [start.spring.io](http://start.spring.io/)
* **Artifact:** sping-boot-web
* **Dependencies:** Web
* Click *Generate Project*
* Unzip and import into Eclipse

Create the following controller

```
@RestController
public class MyController {

	@RequestMapping("/allo")
	public String getPerson() {
		return "Make JAR not WAR";
	}

}
```

Run and visit `http://localhost:8080/allo`


### Going forward

* Josh Long is awesome
  * [Getting Started with Spring Boot](https://www.youtube.com/watch?v=sbPSjI4tt10&t=78s)
  * [Building Microservices with Spring Cloud](https://www.youtube.com/watch?v=ZyK5QrKCbwM)
