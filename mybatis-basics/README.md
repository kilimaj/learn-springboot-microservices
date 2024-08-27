# Mybatis Basics

- Java Persistence framework
- Dynamically implements JDBC code for your interface
- Maps interface methods to actual SQL commands.
- Examples:
  | Method | SQL Statement | Mybatis Annotation|
  |:-----------------:|:-----------------:|:-----------------:|
  |addCustomer | INSERT | @Insert |
  |getCustomerById | SELECT | @Select |
  |updateCustomer | UPDATE | @Update |
  |deleteCustomer | DELETE | @Delete |
  |getAllCustomer | SELECT | @Select |
  |getCustomersByCity | SELECT | @Select |

- Java users all depends on the Mapper Interface example: **CustomerDao**
- To obtain instance of this mapper we use mybatis as a factory
- Mybatis reads information about db connectivity and Mapper interface from **mybatis-config.xml** file
- Mybatis will create a class on the fly during the runtime that implements the Mapper interface then our application gets an instance of this class
- The implementation class created by mybatis uses **JDBC** to connect to the underlying database

  ![Java application mybatis operations](../images/mybatis-basics.drawio.svg)

## Difference between MyBatis and ORM such as Hibernate, JPA ect..

- No need to map class/fields to table/columns
- Automatically detects column names and maps to fields of a class
- Allow use of all Database functionalities such as
  - Stored procedures
  - views
  - Queries of any complexity
  - and Vendor proprietary features
- Good choice for:
  - Legacy systems
  - De-normalized databases
  - Need full SQL execution control in your Java Application
- Supports caching
  - Statements can be cached
  - Avoid unnecessary DB round trips
  - Provides a default cache implementation - Based on Java HashMap
  - Default connectors for integrating with OSCache, Ehcache, Hazelcast and Memcached
  - Provides an API to plug other cache implementations

## Setting up project with H2 Database for testing

- copy qualified name of h2 jar package in maven dependencies
- open terminal and run

```bash
java -jar qualified-name-of-h2-package
```

- After the H2 interface opens
- Change Saved settings to: Generic H2 (Server)
- Go to your computer user folder and create the mybatis-basics.mv.db
- Then paste the following in the JDBC URL: on the H2 interface
```
jdbc:h2:tcp://localhost/~/mybatis-basics
```
- Test The connection and if works then connect
- Use the following SQL tests and paste in the H2 SQL editor to test.
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
**Alternatively**
- You can run the script from a file made in the SQL editor paste
```
runscript from '~/eclipse-workspace/mybatis-basics/customers.sql'
```
