# Procedural Language / pgSQL
* SQL is not turing complete
  * basically it is not a *full* language
* features
  * variables
  * functions
  * exception handling
  * looping / conditional constructs

# example table
* **note:** `serial` is an *int* type that auto increments

```sql
create table flash_card(
  fc_id serial primary key,
  fc_question text,
  fc_answer text
);
```

# Sequences
* pattern

```sql
create sequence fc_id_sequence
start 1;
```

# Functions
* block of code that you can execute
  * can call from `select`, `insert`,
* 0 or many parameters
* return 1 value or `void`
* [Errors and Messages](https://www.postgresql.org/docs/current/static/plpgsql-errors-and-messages.html)

###### create `hello` function

```sql
create or replace function hello(dog text)
returns void as $$
begin
  raise notice 'hi %', dog;
end; $$ language plpgsql;
```

###### we can call the `hello` function from a `select` statement

```sql
select hello('john');
```

# Triggers
* block of code that is automatically executed when events happen
* **trigger function:** A user-supplied function that is declared as taking no arguments and returning type trigger, which is executed when the trigger fires.

###### create `log_new_question` trigger function

```sql
create function log_new_question() returns trigger as $$
begin
  raise notice 'new question: %', NEW.fc_question;
  return NEW;
end; $$ language plpgsql;
```

###### create `fc_log_trigger` trigger

```sql
CREATE TRIGGER fc_log_trigger
  AFTER INSERT
  ON flash_card
  FOR EACH ROW
  EXECUTE PROCEDURE log_new_question();
```

###### let's test it out

```sql
insert into flash_card(fc_question, fc_answer) values('what is java?', 'awesome');
```

# Cursors
* datatype that represents a result set

```sql
create function test() returns refcursor as $$
  declare
    dog refcursor;
  begin
    open dog for select fc_question, fc_answer from flash_card;
    return dog;
  end; $$ language plpgsql;
```

###### this will fail
```sql
select test();
```

###### fetch all rows in a transaction

```sql
begin;
select test();
fetch all in "<unnamed portal 1>";
commit;
```

# Useful links
* [Postgres Key Words](https://www.postgresql.org/docs/current/static/sql-keywords-appendix.html)
* [plpgsql-basics](https://www.marconijr.com/posts/plpgsql-basics/)
* [Comparison Functions and Operators](https://www.postgresql.org/docs/9.6/static/functions-comparison.html)
* [Errors and Messages](https://www.postgresql.org/docs/current/static/plpgsql-errors-and-messages.html)
* [Create Trigger](https://www.postgresql.org/docs/current/static/sql-createtrigger.html)
* [Trigger Procedures](https://www.postgresql.org/docs/current/static/plpgsql-trigger.html)
* [Postgres Triggers](http://www.w3resource.com/PostgreSQL/postgresql-triggers.php)
* [Cursors](https://www.postgresql.org/docs/current/static/plpgsql-cursors.html)
* [How to return a Result Set from a Stored Procedure](http://www.sqlines.com/postgresql/how-to/return_result_set_from_stored_procedure)
