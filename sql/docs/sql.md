# sql
* Structured Query Language
* how we communicate with a relational database
* not case sensitive
  * usually separate words using `_` for example: `BANK_ACCOUNT`
  * note that `BANK_ACCOUNT` and `bank_account` are the same

### Note
Connect to Postgres via command line
```
psql postgres `whoami`
```

`psql` help
```
help
```

You can also use **pgAdmin** or any other client to run these commands.

# problem
* no name
* balance is not a number

```xml
<account>
  <balance>hello world</balance>
</account>
```

```json
{
  "balance" : "hello world"
}
```

# solution

**BANK_ACCOUNT**

| ba_name | ba_balance |
|:-------:|:----------:|
| john    |   100.00   |
|  amy    |   200.12   |

```sql
CREATE TABLE bank_account(
  ba_name    TEXT     NOT NULL,
  ba_balance NUMERIC  NOT NULL
);
```

```sql
INSERT INTO bank_account(ba_name, ba_balance) VALUES ('john', 100);
INSERT INTO bank_account(ba_name, ba_balance) VALUES ('amy', 200.12);

```

# DDL
* Data Definition Language
* `CREATE`, `ALTER`, `DROP`, `TRUNCATE`
* `GRANT`, `REVOKE`

# DML
* Data Manipulation Language
* `SELECT`, `INSERT`, `UPDATE`, `DELETE`

# TCL
* Transaction Control Language
* `COMMIT`, `ROLLBACK`, `SAVEPOINT`,  `SET TRANSACTION`

# Note
* be careful not to use **reserved words** for table and column names

# [Postgres datatypes](https://www.techonthenet.com/postgresql/datatypes.php)

# Constraints
* **Primary Key**
  * unique and not null
  * one or many columns that identify each row
* **Foreign Key**
  * a column that points to another column
  * usually points to a PK
  * has referential integrity (makes sure that it points to a valid value)
* **Not Null**
* **Unique**
* **Check**
  * further restrict values

# Primary Key
* `serial` type auto increments

```sql
CREATE TABLE person(
  p_id   INT   PRIMARY KEY,
  p_name TEXT
);

INSERT INTO person(p_id, p_name) VALUES(1, 'john'); /* success */
INSERT INTO person(p_id, p_name) VALUES(1, 'amy');  /* fail - PK must be unique */
INSERT INTO person(p_name) VALUES('austin');        /* fail - PK must not be null */
```

# Foreign Key

```sql
CREATE TABLE department(
  d_id   INT  PRIMARY KEY,
  d_name TEXT
);

CREATE TABLE employee(
  e_id   INT  PRIMARY KEY,
  e_name TEXT,
  dog    INT,
  FOREIGN KEY (dog) REFERENCES department(d_id)
);


INSERT INTO department(d_id, d_name) VALUES(1, 'sales');
INSERT INTO department(d_id, d_name) VALUES(2, 'finance');
INSERT INTO department(d_id, d_name) VALUES(3, 'marketing');

INSERT INTO employee(e_id, e_name, dog) VALUES(1, 'john',     1);
INSERT INTO employee(e_id, e_name, dog) VALUES(2, 'amy',      1);
INSERT INTO employee(e_id, e_name, dog) VALUES(3, 'austin',   2);
INSERT INTO employee(e_id, e_name, dog) VALUES(4, 'katie',    2);
INSERT INTO employee(e_id, e_name, dog) VALUES(5, 'courtney', 2);
INSERT INTO employee(e_id, e_name, dog) VALUES(6, 'scout',    2);


/* stop to look at data */

INSERT INTO employee(e_id, e_name, dog) VALUES(7, 'john doe', 100); /* fail - no value of 100 in department.d_id */

DELETE FROM department WHERE d_name='sales'; /* fail - would violate referential integrity */

DELETE FROM department WHERE d_name='marketing'; /* success */
```

# Check

```sql
CREATE TABLE person(
  age INT,
  CHECK (age >= 0)
);

INSERT INTO person(age) VALUES(-1); /* fail */
INSERT INTO person(age) VALUES(0);  /* success */
```

# Integrity
* **Domain Integrity**
  * all values in a column are of the same type
  * can use **check** constraint to help make sure values are valid
* **Referential Integrity**
  * FK points to valid values
* **Entity Integrity**
  * should be able to uniquely identify each row *(PK)*
