# Introduction to Test Containers
- Test Containers is an Open Source Library providing lightweight Docker containers for integration testing
- Implementations are avaialable for all popular programming langugeas
  - Java, Go, .NET, Node.js, Python, etc
- Typically used for integration testing with databases, message brokers, auth servers, etc
- Can also be used with custom containers
- **Requirements** Docker installed on your system

# Test Containers with Spring Boot
- Typically Test Containers will assign random ports to running containers to avoid port conflicts
- The Spring Boot support allows for easy detection of Test Containers properties and run time configuration of you integration tests.
- Coming up we will look at the required dependencies and how to configure and use Test Containers with your integration tests

## Setting up test containers
- Add maven dependencies

```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-testcontainers</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.testcontainers</groupId>
            <artifactId>junit-jupiter</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.testcontainers</groupId>
            <artifactId>mysql</artifactId>
            <scope>test</scope>
        </dependency>
```


## Service connection - see documenation - used to conect to the container

## Using Maven to speed up unit tests - test containers can be slwo
- Use Maven Surefire plugin - see documentation 

```xml
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-failsafe-plugin</artifactId>
                <version>3.5.2</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>integration-test</goal>
                            <goal>verify</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>


```