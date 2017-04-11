# joins
* allows us to grab specific information from many tables
* venn diagram

# [types of joins](https://i.stack.imgur.com/66zgg.png)
* inner
* left
* right
* full

# example

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

CREATE TABLE phone_numbers(
  p_id     INT  PRIMARY KEY,
  p_number TEXT,
  cat      INT,
  FOREIGN KEY (cat) REFERENCES employee(e_id)
);


INSERT INTO department(d_id, d_name) VALUES(1, 'sales');
INSERT INTO department(d_id, d_name) VALUES(2, 'finance');
INSERT INTO department(d_id, d_name) VALUES(3, 'marketing');

INSERT INTO employee(e_id, e_name, dog) VALUES(10, 'john',     1);
INSERT INTO employee(e_id, e_name, dog) VALUES(20, 'amy',      1);
INSERT INTO employee(e_id, e_name, dog) VALUES(30, 'austin',   2);
INSERT INTO employee(e_id, e_name, dog) VALUES(40, 'katie',    2);
INSERT INTO employee(e_id, e_name, dog) VALUES(50, 'courtney', 2);
INSERT INTO employee(e_id, e_name) VALUES(60, 'scout');

INSERT INTO phone_numbers(p_id, p_number, cat) VALUES(100, '0000001111', 10);
INSERT INTO phone_numbers(p_id, p_number, cat) VALUES(101, '0000002222', 10);
INSERT INTO phone_numbers(p_id, p_number, cat) VALUES(102, '0000003333', 20);
INSERT INTO phone_numbers(p_id, p_number, cat) VALUES(103, '0000004444', 30);
INSERT INTO phone_numbers(p_id, p_number, cat) VALUES(104, '0000005555', 60);
```

```sql
/* select */
select * from department;
select d_name from department;
select d_name fox from department;

select e_name from employee order by e_name;
select e_name from employee where e_name > 'j';
select e_name from employee where dog is null;

/* inner join */
select e_name, d_name
from department
inner join employee
on dog = d_id;

/* alias */
select emp.e_name, dept.d_name
from department dept
inner join employee emp
on emp.dog = dept.d_id;

/* left, right, full join */
select e_name, d_name
from department
left join employee
on dog = d_id;

/* join all tables */
select e_name person, p_number phone_number
from department
inner join employee on dog = d_id
inner join phone_numbers on cat = e_id
where d_name = 'sales';
```

# Sub-queries
* We can `select` from tables
* A `select` statement returns a **result set**, which is in the same format as a table
* So we can do nested `select` statements

```sql
select e_name bahhh from employee;
```

```sql
select sheep.bahhh from (
    select e_name bahhh from employee
) sheep;
```
