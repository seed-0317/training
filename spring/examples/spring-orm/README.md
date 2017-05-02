# Spring ORM
* Demonstrate Spring & Hibernate integration
* Unit tests with Mockito
* Unit tests with Spring Test

# Spring & Hibernate integration
* File: `src/main/resources/beans.xml`
  * Define 3 Spring Beans: `DataSource`, `SessionFactory`, `TransactionManager`


# Mockito
* Perfect for Business Logic layer
* File: `src/test/java/com/example/test/BusinessLogicTest.java`
  * `@RunWith(MockitoJUnitRunner.class)` allows us to use Mockito with JUnit
  * `Dao` is the mock object
  * `BusinessLogic` is the object that we want to test

`BusinessLogicTest`

```
@RunWith(MockitoJUnitRunner.class)
public class BusinessLogicTest {

	@Mock
	private Dao dao;

	@InjectMocks
	private BusinessLogic businessLogic = new BusinessLogicImpl();

}
```

# Spring Test
* Need for DAO layer because of Spring & Hibernate integration
* File: `src/test/java/com/example/test/DaoTest.java`
  * `@RunWith(SpringJUnit4ClassRunner.class)` allows us to use Spring with JUnit
  * `test-beans.xml` has Spring configuration specific for testing
  * `Transactional` allows our tests to be run in transactions - In Spring Test, they will be rolled back.
  * `Dao` is the object that we want to test

`DaoTest`

```
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/test/resources/test-beans.xml" })
@Transactional
public class DaoTest {

	@Autowired
	private Dao dao;

}
```

`test-beans.xml`
* Inherit normal Spring config in `beans.xml`
* Define Spring Bean for our embedded H2 database
* Override the `SessionFactory` bean
  * Only change is we added two Hibernate properties: **hbm2ddl.auto** and **hbm2ddl.import_files**


```
<import resource="file:src/main/resources/beans.xml"/>

<jdbc:embedded-database id="mydataSource" type="H2"/>

<bean id="mySessionFactory"  class="org.springframework.orm.hibernate4.LocalSessionFactoryBean">  
      <property name="dataSource" ref="mydataSource"></property>  

      <property name="packagesToScan" value="com.example.domain"/>

      <property name="hibernateProperties">  
          <props>  
              <prop key="hibernate.dialect">org.hibernate.dialect.Oracle10gDialect</prop>
              <prop key="hibernate.show_sql">true</prop>    
              <prop key="hibernate.hbm2ddl.auto">create</prop>
              <prop key="hibernate.hbm2ddl.import_files">initial-data.sql</prop>
          </props>  
      </property>  
  </bean>  
```


# Best Practices
* Avoid using Mockito and Spring Test together in the same class.  It makes the tests significantly more complicated.
