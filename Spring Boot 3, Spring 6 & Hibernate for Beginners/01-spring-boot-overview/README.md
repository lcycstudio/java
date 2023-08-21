## Section 1: Spring Boot 3 Quick Start

#### Table of Contents
- Introduction
- How To Take This Course and How To Get Help
- Downloading the Source Code and PDFs
- Java Development Environment Checkpoint
- Spring Boot Overview
- Spring Boot Initialzr Demo
- Spring Boot - Create a REST Controller
- Spring Framework Overview
- Spring Projects
- What is Maven?
- Maven Project Structure
- Maven Key Concepts
- Exploring Spring Boot Project Files - Part 1
- Exploring Spring Boot Project Files - Part 2
- Spring Boot Starters
- Spring Boot Parents for Starters
- Spring Boot Dev Tools - Overview
- Spring Boot Dev Tools - Coding
- Spring Boot Actuator - Overview
- Spring Boot Actuator - Accessing Endpoints - Part 1
- Spring Boot Actuator - Accessing Endpoints - Part 2
- Spring Boot Actuator - Securing Endpoints - Overview
- Spring Boot Actuator - Securing Endpoints - Coding
- Run Spring Boot apps from the Command Line - Overview
- Run Spring Boot apps from the Command Line - Demo
- Injecting Custom Application Properties - Overview
- Injecting Custom Application Properties - Coding
- Configuring the Spring Boot Server - Overview
- Configuring the Spring Boot Server - Coding



### Spring Framework Overview

[spring.io](https://spring.io) is the official website for Spring.

#### Goals of Spring
- Lightweight development with Java POJOs (Plan-Old-Java-Objects)
  - Much simpler to build as compared to the heavyweight EJBs from the early
    versions of J2EE
- Dependency injection to promote loose coupling
  - simply specify the wiring via configuration file instead of hard wiring
    objects togeter
- Minimize boilerplate Java code
  - Spring creates a collection of helper classes to make it easier to minimize
    the boilerplate code


#### Spring Framework Core Components
- Core Container
- Web Layer
- Data Access Layer
- Infrastructure
- Test Layer


#### Core Container
- Beans
  - creates beans and manages bean dependencies
  - reads config files for setting properties and dependencies
- Core
- SpEL
  - Spring Expression Language used within the config files to refer to 
    other beans
- Context
  - holds the beans in memeory


#### Web Layer
Home of the Spring MVC framework

- Serviet
- WebSocket
- Web


#### Data Access Layer
- JDBC
  - communicating with the database, be it either a relational database
    or a NoSQL database
  - making use of like a message queue
  - reduce your JDBC code by 50%
- ORM
  - ORM: Object Relational Mapping
  - integration with Hibernate and JPA
- Transactions
  - add transaction support
  - make heavy use of AOP behind the scenes
  - make use of transactions on methods, database calls, etc...
- OXM
- JMS
  - JMS: Java Message Service
  - sending async messages to a Message Broker
  - Spring provides helper classes for JMS


#### Infrastructure
- AOP
  - AOP: Aspect Oriented Programming
  - add functionality to objects declaratively
  - create services like logging, security, transactions, etc...
  - apply these services to your objects in a declarative fashion
- Aspects
- Instrumentation
  - make use of clas loader implementations to work with different app servers
  - remotely monitor and instrument your application using JMX
- Messaging


#### Test Layer
- Unit
  - supports Test-Driven-Development (TDD)
- Integration
  - create an application context and wire up your desired objects
- Mock
  - mocking out servlets, JNDI access, and so on



### What is Maven?
- Maven is a Project Management tool
- Most popular use of Maven is for build management and dependencies


#### What problems does Maven solve?
- When building your Java project, you may need additional JAR files
  - For example: Spring, Hibernate, Commons Logging, JSON etc…
- One approach is to download the JAR files from each project web site
- Manually add the JAR files to your build path / classpath


#### Maven Solution
- Tell Maven the projects you are working with (dependencies)
- Spring, Hibernate etc ….
- Maven will go out and download the JAR files for those projects for you
- And Maven will make those JAR files available during compile/run
- Think of Maven as your friendly helper / personal shopper

![Maven]()
![Route Between Nodes](https://github.com/lcycstudio/java/blob/master/Spring Boot 3, Spring 6 & Hibernate for Beginners/01-spring-boot-overview/maven.png)