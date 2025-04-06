# Spring MongoDB Notes

*Dependencies for Spring*

```xml

<dependencies>
    <!-- Spring Boot Starter for MongoDB -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-mongodb</artifactId>
    </dependency>

    <!-- Optional: Spring Boot Starter Web (if you're building a REST API) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Optional: Lombok for cleaner entity/model code -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <scope>provided</scope>
    </dependency>

    <!-- Optional: Validation support -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
</dependencies>


```
Properties
```properties
spring.data.mongodb.uri=mongodb://root:example@localhost:27017/your-db-name
```

```xml

<compilerArgs>
    <compilerArg>-Amapstruct.defaultComponentModel=spring</compilerArg>
</compilerArgs>


```