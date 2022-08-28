# Spring Boot "GET PRODUCT" API Example 

This is a sample Java / Maven / Spring Boot (version 2.7.1) application that can be used as a starter for creating a api complete, I hope it helps you.

## How to Run 

This application is packaged as a jar which has Tomcat 8 embedded. No Tomcat or JBoss installation is necessary. 

* Clone this repository 
* Make sure you are using JDK 1.8 and Maven 



Once the application runs you should see something like this

```
2022-08-28 11:08:37.054  INFO 11644 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2022-08-28 11:08:37.064  INFO 11644 --- [  restartedMain] com.product.ppp.ProductApplication       : Started ProductApplication in 3.756 seconds (JVM running for 6.662)
```

## About the Service

The service is just a simple hotel review REST service. It uses an MYSQL database to store the data.  If your database connection properties work, you can call some REST endpoints defined in ```com.product.ppp.productController``` on **port 8080**. (see below)

More interestingly, you can start calling some of the operational endpoints (see full list below) like ```/getproducts/{id}``` and ```/showallproducts``` (these are available on **port 8080**)

You can use this sample service to understand the conventions and configurations that allow you to create a DB-backed RESTful service. Once you understand and get comfortable with the sample app you can add your own services following the same patterns as the sample service.
 
Here is what this little application demonstrates: 

* Full integration with the latest **Spring Boot** Framework: inversion of control, dependency injection, etc.
* Packaging as a single jar with embedded container (tomcat 8): No need to install a container separately on the host .
* Demonstrates how to set up getproduct, showall,deleteproduct by id  , etc. endpoints automatically on a configured port. Inject your own health / metrics info with a few lines of code.
* Writing a RESTful service using annotation: supports both XML and JSON request / response; 

* *Spring Data* Integration with JPA/Hibernate with just a few lines of configuration and familiar annotations. 
* Automatic CRUD functionality against the data source using Spring *Repository* pattern


Here are some endpoints you can call:

### Get information about products with final price by id  , show all products , delete product by id etc.

```
http://localhost:8080/getproducts/1001
http://localhost:8080/getproducts/1002
http://localhost:8080/getproducts/1003
http://localhost:8080/getproducts/1004
http://localhost:8080/getproducts/1005
```

### Create a hotel resource

```
GET /getproducts/1001
Accept: application/json
Content-Type: application/json
{
"productId": 1001,
"name": "Lenovo Yoga",
"productType": "Laptop",
"category": "Electronics",
"basePrice": 45000,
"discount": 6750,
"charges": {
"gst": 6864.406779661018,
"delivery": 350
},
"finalPrice": 45464.40677966102
}
RESPONSE: Initializing Spring DispatcherServlet 'dispatcherServlet'
2022-08-28 11:29:41.221  INFO 11644 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2022-08-28 11:29:41.223  INFO 11644 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 2 ms



### Update a Product

```
GET http://localhost:8080/updatedata/1001
Accept: application/json
Content-Type: application/json
provide updation in code by get set 
RESPONSE:  (No Content)
```
#



# About Spring Boot

Spring Boot is an "opinionated" application bootstrapping framework that makes it easy to create new RESTful services (among other types of applications). It provides many of the usual Spring facilities that can be configured easily usually without any XML. In addition to easy set up of Spring Controllers, Spring Data, etc. Spring Boot comes with the Actuator module that gives the application the following endpoints helpful in monitoring and operating the service:

**/getproducts/1001** Shows product  information along with GST and final price for the current id you provided e.g-1001, 1002 , 1003 , etc.

**/showallproducts** Shows all products  information.

**/savedata** to save data on database (product)

**/updatedata/1002** to update product by adding info on code 

**/deletedata/1003** to delete product from database.



### To view your H2 in-memory datbase

The 'test' profile runs on MYSQL database. To view and query the database you can browse to jdbc:mysql://localhost:3306/products. Default username is "root" with a "root" password. 

# Running the project with MySQL

This project uses MYSQL database so that you don't have to install a database in order to run it.  Since the project uses Spring Data and the Repository pattern, it's even fairly easy.

Here is what you would do to back the services with MySQL, for example: 

### In pom.xml add: 

```
      <dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.6</version>
		</dependency>
```

### Append this to the end of application.properties: 

```
---
spring:
  ## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
spring.datasource.url = jdbc:mysql://localhost:3306/products
spring.datasource.username = root
spring.datasource.password = root
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
## Hibernate Properties
# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto = update
spring.jackson.serialization.fail-on-empty-beans=false



```



# Attaching to the app remotely from your IDE

Run the service with these command line options:

```



# Questions and Comments: abhipatil99831@gmail.com

