# Maven
* Java build tool
* Maven is opinionated

### Dependencies
* Maven makes it easy to manage dependencies
* Downloads dependencies in the `~/.m2/` directory
* Specify what dependencies you want in the `pom.xml`

### Project structure

```
my-project
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   └── resources
    └── test
        ├── java
        └── resources
```


### Commands
* first `cd` into a maven project

**Ensure you have maven installed**

```
mvn --version
```

**Delete `./target/` directory**

```
mvn clean
```

**Run tests**

```
mvn clean test
```

**Package application**

```
mvn clean package
```


# Useful Links
* [Maven in 5 Minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
* [Introduction to the Build Lifecycle](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)
