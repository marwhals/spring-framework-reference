# Spring Security notes ------ OWASP top 10

## Dependencies

This is required and will set defaults in the spring application.

```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>


```

Security related properties

```properties

rest.template.rootUrl=http://localhost:8080
rest.template.username=user1
rest.template.password=password

```