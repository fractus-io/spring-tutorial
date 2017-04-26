# Spring Framework Tutorial

---

### Agenda

* Module 1: Introduction to Spring Framework
* Module 2: Spring Framework Dependency Injection 
* Module 3: Spring Framework AOP 
* Module 4: Spring Framework Data Access
* Module 5: Spring Framework MVC
* Module 6: Spring Framework Remoting
* Module 7: Design Patterns with Spring Framework


---

### Introduction to Spring Framework

Topics

* Spring History
* What is Spring
* Why Spring 
* Spring architecture

---

### Spring History

* Started 2002/2003 by Rod Johonson and Juergen Holler
* Started as a framework developed around Rod Johnson’s book [Expert One-on-One J2EE Design and Development](https://www.amazon.com/Expert-One-One-Design-Development/dp/0764543857)
* Spring 1.0 Released March 2004
* ...
* Spring 4.2.0 Released July 2015


---

### What is Spring

* Spring Framework is an open source light-weight application framework that aims to make J2EE developement eaisier.
* Spring aims to help whole applications in a consistent and productive manner
* Used for building Java SE & Java EE applications


---

### What is Spring - Key Features

* JavaBeans-based configuration management, applying Inversion-of-Control principles, specifically using the Dependency Injection technique.
* A core bean factory, which is usable globally
* Generic abstraction layer for database transaction management
* Built-in generic strategies for JTA and a single JDBC DataSource


---

### What is Spring - Key Features

* Integration with persistence frameworks Hibernate, JDO and iBATIS
* MVC web application framework, built on core Spring functionality, supporting many technologies for generating views, including JSP, FreeMarker, Velocity, Tiles, iText, and POI
* Extensive aspect-oriented programming (AOP) 


---

### Why Spring

* Problems with Traditional Approach to J2EE ...
  * The EJB component model is complex
  * EJB is designed for distributed, transactional applications. While all non-trivial applications are transactional, distribution should not be built into basic component model
  * J2EE applications are hard to unit test


---

### Why Spring

* Responses to problems was tool support to catch up with J2EE specifications, e.g code generations tools
* Spring aims to take away problems, by simplifying the programming model, rather than concealing complexity behind the complex layer of the tools
* The essence of the Spring is in providing eneterpise sevices to Plain Old Java Object(POJOs). This is valuable in a J2EE enviroment, but application code delivered as POJOs is naturally resuable in variety or runtime enviroments


---

### Why Spring

* Wiring of components through Dependency Injection
* Design to interfaces
* Test-Driven Development (TDD)
* POJO classes can be tested without being tied up with the framework
* Declarative programming through AOP
  * Integration with other technologies
  * EJB for J2EE
  * Hibernate, iBatis, JDBC (for data access)
  * Velocity (for presentation)
  * Struts and WebWork (For web)


---

### Overview of the Spring Framework

* Inversion of Control container
  * Dependecy Injection
* Aspect-Oriented Programming(AOP) framework
* Data Access abstracion
* JDBC simplification
* Transation Management
* MVC web framework
* Simplification for working with JNDI, JTA
* Lightweight remoting
* JMS support
* Support for testing

---

### Overview of the Spring Framework

![](http://docs.spring.io/spring/docs/current/spring-framework-reference/html/images/spring-overview.png.pagespeed.ce.XVe1noRCMt.png)

