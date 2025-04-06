# Spring Logging / Logbook

## HTTP Request and Response Logging
- For debugging or auditing, a common use case is to log the HTTP Requests and Response
  - This includes logging of the reqeust headers and body
  - Details of what was sent in the HTTP payload can be very helpful.
- Support for this varies depending on the HTTP library being used
- Spring has limited support, and typically cannot log the HTTP body
- The majority of option do no have the ability to mask sensitive information written to logs.

## Zalando Logbook
- A large european retailer HQd in germany
- Zalando Logbook is an open source HTTP Request and Response Logging library.
- Logbook supports all major Java servers and clients
- Logbook is a standardised way to log HTTP requests and responses including the HTTP body

## Logbook features
- Sensible defaults out of the box
  - Convenient Spring Boot Starter available
- Customisation of logging format, destination and conditions to log
- Ability to obfuscate data
- Integration with popular logging aggregators

## Usage
- Add Spring Boot Starter to Project
  - Provides sensible defaults with auto configuration
- Enable tracing log level
- JSON Log Output
  - Using JSON log output is helpful for logging aggregators
  - Makes log searches much easier because data can be indexed for searching