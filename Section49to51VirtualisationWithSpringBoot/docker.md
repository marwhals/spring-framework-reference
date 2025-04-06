# Docker

- Docker is an open platform for developing, shipping and running applications
- It enables you to separate your applications from your infrastructure so you can deliver software quickly.
- With Docker, you can manage your infrastructure in the same ways you manage your applications

- What is a Container?
  - A container is a lightweight, standalone, executable package of software that includes everything needed to run an application: code, runtime, system tools, libraries and settings.
- Isolation: Containers ensure that applications run in isolation from one another.
- Consistency: They provide a consistent environment across different stages of development from development to testing to production.
- Efficiency: Containers share the host system's kernel and do not require a full operating system, making them more efficient than virtual machines.

- What is an Image?
  - A Docker image is a read-only template used to create containers.
  - Images contain the application and all the dependencies required to run that application.
- Layers: Images are built in layers. Each layer represents and instruction in the Image's Dockerfile. When you change a layer, only that layer is rebuilt, making images lightweight, small and fast to build.
- Portability: Images can be shared across different environments and platforms.

## Docker Components
- Docker Desktop - GUI application fo all major operating systems
- Docker Engine - The runtime for Docker Containers
- Docker Build - The build system to create Docker Images
- Docker Compose - Allows you to compose multi-container applications.
- Docker CLI - Command Line Interface for Docker
- Docker Scout - Vulnerability detection for Docker Images
- Docker Extensions - 3rd party extensions for the Docker environment
- Docker Hub - Docker's Image repository

## Docker Networking
- Docker networking allows containers to communicate with each other, with the Docker host and with external networks such as the internet.
- It provides various networking options to suit different use cases, ensuring isolation, scalability and flexibility.
- Docker can have one or more virtual networks
- Containers get a virtual IP on one or more networks
  - Containers can use the same port since they have their own IP

## Docker Networking Drivers
- Bridge - Default network driver. Docker Containers run in Isolation from host network.
- Host - No network isolation. Use same network as host.
- None - Completely isolate container from host and other containers.
- Overlay - Connect multiple Docker Engines on different hosts together.
- ipvlan - IPvlan networks provide full control over both IPv4 and IPv6 addressing.
- macvlan - Assign MAC address to a container

## Creating a Docker Image

```bash
./mvnw clean package spring-boot:build-image
```

## Running Images with Docker
```bash
docker run $IMAGE_NAME
docker run -p 8080:8080 $IMAGE_NAME
#rename using the --name <image_name>
```

## Gateway Configuration
- In a Bridge Network, processes in the Docker Network are isolated from the host network.
  - IP 1 cannot reach 8081 of the host system
- Existing Gateway configuration uses routes to http://localhost:8080 - which will not work form the Docker Network
- Needs to use routes like
  - http://<docker-name>:<docker-port>

## Spring Security Configuration
- Currently, we are getting and validating JWT tokens via http://localhost:9000
- By default, Spring Security will sign the issuer of the JWT token issuer as the host name of the request - i.e http://localhost:9000
- If we get the JWT token from http://localhost:9000, services will  not be able to authenticate the token from inside the Docker Network. Issuers will be different and auth will fail.
- Solution: Authorisation Server needs to move behind the gateway
- Issuer will adapt to use the Docker container name - i.e http://auth-server:9000
- The Spring Boot rest services will need to be updated with the Spring Authorisation Server
  - During Authentication, the services need to call back to the Spring Authorisation Server to validate the JWT token
- Variable set in the environment will override variables set in the application.properties file
  - The property `spring.security.oauth2.resourceserver.jwt.issue-uri=http://localhost:9000`
  - Would be overridden with `SPRING_SECURITY_OAUTH2_RESOURCESERVER_JWT_ISSUER_URI=http://auth-server:9000`