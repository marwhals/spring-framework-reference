# The Traditional Monolith Application

## Monolithic Architecture
- Single Application
  - One code base
  - One build system
  - Single execution program (ie WAR or EAR file)
  - In Enterprise system - an application can become very big
    - 10,000s of packages.

## Traits of a Monolithic Architecture
- Code is stored together
- Typically, will use one database
- Code Releases are done as one big version
- Scaling is an all or nothing situation
  - If one component needs to increase scala the whole application needs to scala.

## Benefits of Monoliths
- Development is easy - everything is in one project
- Deployment is easy - One app to deploy
- Testing is simplified - One app to test

## Problems with Monoliths
- As the business requirements of Monoliths grow, so does their complexity.
- Can lead to anti-patterns - such as Spaghetti Code and Big Ball of Mud design patterns
- Difficult to modify - Even the smallest change will require a full deployment of the application.
- Technology Lock in - The monolith becomes tightly coupled to the technology stack
- Difficulty to introduce new technologies
- CI/CD difficult

## Are Monoliths Bad?
- Answer - It Depends

## What are Microservices
- Microservices small targeted services
- Each service has its own repository
- Microservices are isolated from other services
  - Should not be bundled with other services when deployed
- Microservices are loosely coupled
  - When interacting with other services, should be done in a technology-agnostic manner
  - i.e - Restful web services - HTTP / JSON

## Microservice Architecture
- With a Microservice Architecture
  - Applications rae composed using individual microservices
  - Each service will typically have its own database
  - Each microservice is independently deployable
  - Scaling of individual services is not possible
  - CI/CD becomes easier since services are smaller and less complex to deploy

## Benefits of Microservices
- Easy to understand and develop - Services are smaller and more targeted
- Software Quality - Since services are more targeted and have a limited scope
- Scalability - Independent services can be scaled up and down to the application's demands
- Reliability - Software bugs are isolated
- Technology flexibility - Services can be developed using any language or stack

## Cons of Microservices
- Integration testing can be difficult
- Deployment are more complex. Rather than one application to deploy, you now have many.
- Operational cost with each service - Each service is a small application
  - Needs own repo, own deployment process etc
- Additional hardware resources - Additional service need additional hardware to run on

## How 'Big' Should a Microservice Be?
- A microservice can be as small as a single API endpoint
  - i.e 'Get Orders'
- A microservice can be several or even dozens or API endpoints
- Answer is a topic of much debate
- Guideline - Amazon's Two Pizza Team - A microservice should be able to be supported by a team you can feed with two pizzas.
- Scalability - This can also be a consideration in the size of a microservice
  - The higher the scalability, the more specialised the service should be.

# What is the Cloud?
- The 'Cloud'?
- The 'Cloud' is not a physical object but more of a concept.
- The 'Cloud' allows you to use virtual servers and services
- The 'Cloud' abstracts the physical underlying hardware services
- Amazon Web Services for example:
  - Allows provisioning in zones - a physical region made of many data centres appearing as one.
- Virtualization is not Cloud Based Architecture.....

# Cloud Based Architectures
- Microservices are a key aspect of Cloud Based Architectures
- Cloud based architectures focus on abstraction, redundancy and avoidance of single point of failures.
- For example saving a file to AWS S3
  - File is copied to multiple servers and in multiple data centres before the 'save' is confirmed.
  - Thus protected from server failure and even loss of a data centre.

## Microservices in Cloud Based Architectures
- Typically multiple instances of microservices are deployed in a cloud environment
- Important to reliability of the application as a whole
  - If a service instance is terminated, another running instance can assume the workload
- Netflix has a tool called Chaos Monkey who's job is to randomly terminal components to ensure there are no single points of failure.

## Common Microservice Deployment Tools
- Quite broad
  - AWS Beanstalk
  - AWS ECS / EKS
  - Kubernetes
  - Docker Swarm
  - Red Hat OpenShift
  - Cloud Foundry

## Adopting Microservices
- Often applications will start as monoliths
  - Might be because of being older legacy applications
  - Or a development choice
    - Remember there is a 'cost' to splitting into micro services
  - Monolithic architectures are well established in companies.
  - Many companies are just starting to adopt Microservices (*2019*)

## Decomposing to Services
- Decomposing is the process of taking a larger monolithic application and breaking it up into microservices
- Decomposition is more of an 'art' than a science
- Strategies you can use:
  - By Business Capability - i.e Order Service
  - By Domain Objects - i.e Product Service (services over domain object "Product")
  - By action verbs - Payment Service
  - By Nouns - Customer Service

## Single Responsibility Principle
- Single Responsibility Principle (SRP) is a term coined by Uncle Bob Martin about object orientated programming
  - SRP says a class should have just one reason to change.
  - Meaning your classes should be very specific in what they do
  - Do one thing and do it well.
- SRP can also be applied to microservices
  - Do one thing and do it very well

## Microservices and Development Teams
- Larger organisations may have 100s of developers
- When possible small teams should be responsible for specific microservices.
- This will often lend itself to business functions
  - An account team would work on accounting related services.
  - A Customer Order team would work on Customer Order related services
  - An Order Fulfillment team would work on Order Fulfillment related services
- Often you will see a lot of overlap of business domain with the domain of the services

## Microservice Architecture and Design
<Diagram here>

## Gateway
- Endpoint that is exposed to other services
  - Can be internet for public APIs
  - More likely to be internal
- Abstract implementation of services
- Client calls URL is unaware of routing taking place to running instance.
- Acts as roughly a proxy for network traffic
- Can also act as a load balancer

## Service Instances
- Expect to be running N number of services
- Exact number depends on reliability and load requirements
- Minimum might be 3 for high availability
- Some tools allow you to dynamically scale based on load or anticipated load
  - Think Netflix at night
    - In evenings, Netflix traffic is 1/3 of US internet traffic
    - Netflix will scale up and down with load

## Database Tier
- Typically one database per microservice
  - Guideline - not a hard 'rule'
- Highly scalable services will often have on transactional database
  - And one or more read database (replicas)
- Organisations will often have more than one database technology
- Not uncommon to see mix of SQL and NoSQL database technologies

## Messaging
- A common pattern is to expose an API endpoint via a RESTFul API
  - Dependent microservices are often message based
  - Messages follow an event or command pattern
- Messaging allows for decoupling and scalability
- Messaging can be used to define a work flow
  - New Order, Validate Order, Charge Credit Card, Allocate Inventory, Ship Order

## Downstream Services
- Often an action on a microservice will invoke actions on multiple down stream services
- For example, it is rumored a search on Amazon will invoke over 100 services to return the search results - search, sponsors, your history, logging your search etc.
- Placing a new order might invoke the following:
  - Validated order
  - Pay Credit Card
  - Allocate inventory
  - Ship order

### The Twelve-Factor APP
*See website for useful perspective*

https://12factor.net/

## 