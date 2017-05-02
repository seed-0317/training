# Spring Data
* Demonstrate Spring Data features

### Configure Spring Data JPA
* Spring Data JPA works for any ORM... you just need an adapter
* In `beans.xml` wire beans `DataSource`, `EntityManager`, and `TransactionManager`
  * Hibernate's SessionFactory is similar to JPA's EntityManager
  * Notice that this is very similar to Spring ORM
* Define `HibernateJpaVendorAdapter`
* **Note:** Spring has a new name for DAOs: **repositories**


### Basics
* Define an interface that extends `JpaRepository`

```
@Repository
public interface FlashCardRepository extends JpaRepository<FlashCard, Integer> {}
```

* We now have basic CRUD methods for free!
* If we follow Spring Data's naming conventions, we can add functionality without defining any method implementations

```
@Repository
public interface FlashCardRepository extends JpaRepository<FlashCard, Integer> {
	FlashCard findFlashCardByQuestion(String question);
}
```
