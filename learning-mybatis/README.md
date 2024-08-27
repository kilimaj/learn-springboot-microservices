# mybatis-learn

 - Just some SQL tests
 
 ```sql
 create table customers (
 	id int primary key auto_increment,
 	name varchar(100) not null,
 	city varchar(100) default 'Bangalore',
 	email varchar(255) unique,
 	phone varchar(255) unique
 	);
 ```
 
 ```sql
 insert into customers (name, email, phone) values ('John', 'john@john.co', '123456789'), 
 ('Juma', 'juma@juma.co', '4357853289'), ('Hellen', 'hellen@john.co', '655443331'),
 ('Glad', 'glad@john.co', '12782666789'); 
```

```sql
select * from customers;
```

``` 
runscript from ~/eclipse-workspace/mybatis-learn/customers.sql
```