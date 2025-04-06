# Notes on Kubernetes

## Introduction to Kubernetes
- What is it?
  - An open-source platform for automating the deployment, scaling and management of containerised applications
  - Developed by Google and now maintained by the Cloud Native Computing Foundation
  - Kubernetes is Greek for helmsman or pilot
  - Abbreviated as K8s - K <*8 letters*

# Origins
- Developed by Google based on an internal system
- Released as an open source project in 2014

# History
- Version 1.0 released in 2015
- Donated to CNCF shortly after its release
- Rapid adoption and growth, de factor standard for container orchestration

# Major Components of Kubernetes
- Master Node Components
  - API Server: Exposes the Kubernetes API
  - etcd: Key-value store for all cluster data
  - Controller Manager: Runs controller processes
  - Scheduler: Assigns work to nodes
- Worker Node Components
  - Kubelet: Agent running on each node, ensuring containers are running
  - Kube-proxy: Network proxy and load balancer
  - Container Runtime: Software to run containers (e.g Docker)

# Kubernetes Architecture
- Cluster
  - A set of nodes (machines) running containerised applications
- Nodes
  - Worker machines in Kubernetes, could be virtual or physical
- Pods
  - Smallest deployable units that can be created and managed in Kubernetes
- Services
  - Abstractions to expose an application on a set of Pods

# DevOps with Kubernetes
- Continuous Integration / Continuous Deployment (CI/CD)
  - Automated pipelines for building, testing and deploying applications.
- Infrastructure as Code (IaC)
  - Manage infrastructure using code and configuration files (e.g Helm Charts)
- Monitoring and Logging
  - Tools like Prometheus and Grafana for monitoring; ELK stack for logging.

# Techniques for Deploying Applications
- Manual Deployment
  - Using kubectl commands to manage resources
- Declarative Configuration
  - Use YAML files to define the desired state of the system.
- Helm Charts
  - Package manager for Kubernetes, simplifying deployment
- Operators
  - Extension to Kubernetes to manage complex applications

# Best Practices
- Namespace Usage
  - Organise resources for different environments (e.g dev/test/prod)
- Resource Requests and Limits
  - Define CPU and memory requirements to ensure stability
- Rolling Updates
  - Deploy new versions of applications with zero downtime
- Security
  - Use Role-Based Access Control (RBAC) to manage permissions

### Task outline
- Use Docker Desktop to create a single node Kubernetes Clust (alter as I feel like)
- Create Deployments for the 7 images in this reference
  - Similar to Docker Compose
- Create Services

# Kubernetes Deployments

## Kubernetes Pods
- Pods
  - Groups of one or more containers
  - Most common is one container per pod
  - Can have 0 to N instances
  - Can run on one or more nodes (machines / VMs)

## Kubernetes Services
- Services
  - A Service is a method for exposing to the network applications running in Pods
  - Pods get assigned an IP address, but are not permanent
  - Deployment, Node failures, scaling up / down will change Pod IPs
  - Services are an abstraction over Pods
  - Services also provide service discovery
    - i.e An 'auth-server' service will be the host 'auth-server'
    - Other services calling the host 'auth-server' will have their traffic routed to a pod instance

## Deploying to Kubernetes
- Pods and Services are deployed using the `kubectl` command
- Use `kubectl`to generate deployment yaml file
- Use `kubectl` to deploy deployment
- Use `kubectl` to create service definition file
- Use `kubectl` to deploy service