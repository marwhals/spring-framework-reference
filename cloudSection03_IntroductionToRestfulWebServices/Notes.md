# RESTful web services --- Cover if requried

# Richardson Maturity Model
- Level 1 - Breaks large service into distinct URIs
- Level 2 - Introduces verbs to implement actions
- Level 3 - Provides discoverability making the API more self documenting

# Spring Framework and RESTful Services
- The spring framework has very robust support for creating and consuming RESTFul Web Services
- Spring Framework has 3 distinct web frameworks for creating RESTful services
- Spring Framework has 2 distinct web clients for consuming RESTful services
- There are also several popular libraries for creating and consuming RESTFul services frequently used with spring

---
# Creating RESTful webservices

## Spring MVC - Web Framework
- Spring MVC is the oldest and most commonly used library for creating RESTful web services
- Part of the core Spring Framework
  - Compatible with Java EE (Jakarta EE in Spring 6)
- MVC - Model View Controller
- Has robust support for traditional Web Applications
- Based on traditional Java Servlet API
  - *By nature this is blocking and non-reactive*

## Spring WebFlux - Web Framework
- Spring WebFlux was introduced with version 5 of the Spring Framework
- WebFlux uses project Reactor to provide reactive web services
  - Does not use Java Servlet API, thus is non-blocking
- Follows very closely to the configuration model of Spring MVC
  - Provides an easy transition for developers accustomed to traditional spring MVC

##  WebFlux.fn - Web Framework
- Also introduced in Spring Framework 5
- Alternative to annotation based configuration
- Designed to rapidly and simply define microservice endpoints

---
# Consuming Microservices

## Spring RestTemplate - Web Client
- RestTemplate is Spring's primiary library for consuming RESTful web services
- Very mature - been a part of Spring for a very long time
- Highly configurable
- As of Spring Framework 5 RestTemplate is in maintenance mode
  - No new features
  - Step before deprecation, Spring recommends using WebClient for new 

## Spring WebClient - Web Client
- Spring WebClient was introduced in Spring Framework 5
- This is Spring's reactive web client
- By default, uses Reactor Netty, a non-blocking HTTP client library

### Marshalling / Unmarshalling
- Converting Java POJOs to JSON or XML is called Marshalling
- Converting JSON or XML to Java Objects is called Unmarshalling
- By default, Spring Boot configures Jackson to facilitate Marshalling and Unmarshalling
- Spring boot does support several other libraries, however Jackson is by far the most popular

---
# SPA - Single Page Applications
- RESTFul APIs are often combined with SPA applications for rich user web applications
- Popular client side SPA frameworks include Vue, BackBoneJS, ReactJS, AngularJS and EmberJS
- Frequent question is which framework is the "best" to use with Spring Boot
- The correct answer is that it does not matter
  - The framework used is decoupled from Spring via the HTTP / JSON (or XML) layer
  - All of these libraries can consume RESTFul APIs
  - Server side can be Spring Boot, .NET, Ruby on Rails etc - the RESTful API abstracts the implementation