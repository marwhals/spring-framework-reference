# OpenAPI what is it?

- OpenAPI is a specification standard to describe RESTful APIs
- OpenAPI is a structured document written in JSON or YAML which adheres to the specification schema
- OpenAPI is used to:
  - Define API Endpoints
  - Authentication Methods
  - Parameters
  - Expected request and response bodies

# OpenAPI History
- OpenAPI's origin starts with the Swagger Specfication in 2010
- Swagger became OpenAPI with v 2.0.0 and was donated to the Linux Foundation
- SmartBear created OpenAPI initiative which includes big name companies
- In February 2021 OpenAPI released version 3.1.0 which included alignment with JSON schema and Webhook support
- Often abbreviated as OA3 (OpenAI 3.x)

# OpenAPI Today
- Today OpenAPI has wide adoption in industry
- OpenAPI has become the de facto standard for defining APIs
- OpenAPI Generator can be used to generate client and server stubs for most popular programming languages
- OpenAPI has a large, robust open source community.

# OpenAPI Generator Clients
# OpenAPI Generator Server Stubs

# Code First Development With OpenAPI
- Most programming languages have libraries to generate the OpenAPI specification from the source code
- Good for initial spec generation for existing projects
- Specification will always match what the source code has defined
- Source code can be decorated to improve completeness of generated specification

# Problems with Code First Development
- Generated OA3 Specification is typically minimal
- Source code decorations to improve generated code creates clutter in source code
- Breaking API changes are hard to detect because spec always matches source code
- Lack of single source of truth for what the API should do
  - Is it the source code? Could be JIRA, email, wiki page etc

# Specification First Development
- In Spec First development, the OA3 Specification is created first
- The OA3 spec becomes the contract to define what is expected of the API
  - Single source of truth to define the API
- Enables parallel development - the producer and consumer can each develop to the spec.
- The produced specification is much richer in content than a generated specification

# Best Practices
- Write OpenAPI specification first
- Provide rich meta-data in specification
- Use JSON schema feature to define expected request and response payloads
- Define properties that are required
- Define constraints - i.e min/max size, date formats, etc
- Use OpenAPI Generator to generate client, server stubs and data models
- Use tools to verify adherence to specification in integration tests

---
# OpenAPI for Spring Boot
- OpenAPI Specification Generation (Code First)
  - Spring-Fox - Use for OpenAPI 2 / Swagger
    - !Warning! - Project seems to be dead. Last release in 2020
  - Springdoc - Use for OpenAPI 3
    - Project is active and part of OpenAPI collective
    - Use Springdoc v2 for Spring Framework 6 support

# OpenAPI for Testing
- Atlassian Swagger Request Validator - This is a rich library for testign HTTP Requests and Responses against an OpenAPI Specification
- Validates your code matches the OpenAPI Specification
- Spring MVC / Mock MVC support
- Validates Pact Consumer Driven Contracts
- Validates RestAssured Tests
- Validates WireMock interactions

# OpenAPI for Code Generation
- OpenAPI Code Generation Plugins are available for both Maven and Gradle
- Very useful for consuming 3rd party APIs with OpenAPI Specification
  - Generated client code can be a separate project or in a submodule
  - When you have a quality OpenAPI specification, generated client code is usable
- Can be used to generate server stubs - good starting point
- Can be used to generate request / response POJOs
  - Often useful to publish POJOs in jar to share with other projects

# Best Practices
- Use Spec First Development
- Use OpenAPI code generator to generate client when available
- Use OpenAPI to code Generator publish and share model when possible
- Use Swagger Reqeust Validator when possible
  - Verify Spec in integration tests, Pact Contracts or with RestAssured