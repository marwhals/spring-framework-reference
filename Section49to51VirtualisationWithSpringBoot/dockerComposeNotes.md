# Docker Compose - Spring Perspective

## What is docker compose?
- A tool for defining and running multi-container applications
- Containers are defined in a single YAML configuration file
- A single command can stop and start all containers
- Can also be used to build and publish images


## Intro
- Compose V1
  - Written in Python, released in 2014
  - User command `docker-compose`
  - Used top level version element 2.0-3.8
  - July 2023 Compose V1 stopped receiving updates
  - Compose V1 no longer included with Docker Desktop
- Compose V2
  - Written in Go, released in 2020
  - Became default for Docker Desktop in April 2022
  - Use command line `docker compose` for consistency with Dockers CLI
    - Alias exists for previous version
  - Ignores top level version property in compose yaml file
  - Has backwards compatibility with V1 files