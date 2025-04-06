# Introduction to Spring Application Events
- Spring Events
  - System Events - Subscribable Events in the application context
    - Typically, Life Cycle Type Events or OS Level Events
  - Application Events - Subscribable Events Defined in the Application
- Application Events allow you to publish an event for zero, one or more subscribers
- By default they are synchronous
- Optionally they can be asynchronous

## Example use cases
- Sending an Email
- Recording an Audit Log
- Notifying One or Multiple Consumers of a State Change
- Recording Login Attempts
- Post Processing - such as Fraud Detection

## Observer Pattern TODO see "Design Patterns - Elements of Reusable Object-Orientated Software" book
- Spring Events implement the observer pattern
- Originally Defined in Design Patterns
  - Nicknamed as a part of the Gang of Four
- Relevant but for C++. OOP concepts transfer to Java

## TODO insert class diagram 

## Application Events in Spring
- Events are Defined as Java POJOs
- Events are Published via Springs Application Event Publisher
- Events are subscribed by:
  - Components implementing the ApplicationEventPublisherAware Interface
  - Components Implementing the ApplicationListener Interface
  - Components with Methods Annotated with @EventListener