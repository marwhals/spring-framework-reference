# Spring Boot Actuator
- A set of endpoints which allows you to monitor and manage your application via HTTP or JMX

## What can you do with Spring Boot Actuator
- Monitor the health of:
  - The Application
  - Database Connections
  - Memory Metrics
  - Disk Space
- Change Log Levels
- Enable Graceful Shutdowns
- Get a variety of metrics
- View Audit Events
- Tracing of Requests
- Recording of HTTP exchanges
- Integration with a variety of Monitoring tools such as Data Dog, Atlas and Prometheus

## Spring Boot Actuator - Health
- The health endpoint is the only endpoint which is enabled by default
- If using Spring Security configuration is required to expose the endpoint
- The health endpoint is useful in deployment environments which can utilise a health check
  - Docker Compose, Elastic Beanstalk, Kubernetes.....etc

## Spring Boot Actuator - Kubernetes Support
- Spring Boot Actuator has two additional probes for Kubernetes
  - Readiness - Returns a HTTP 503, Service Not Available until the application has started.
  - Liveness - Will return a HTTP 200 once the application is ready to start accepting traffic
- These probes allow Kubernetes to monitor the startup of an application and wait to send traffic until the application is ready
- Also, can prevent false health check failures if application takes some time to start.

