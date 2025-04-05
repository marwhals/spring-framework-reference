# API Docs as Code
- Follow Spec First Development
  - Generated Specifications Lack richness and lead to inadvertent breaking changes
- API Doc as Code - follow same best practices for software
- Like source code, break your OpenAPI specification into manageable and resusable components
  - A OpenAPI Specification for a modest application can grow to excess of 1000s of lines.
    - *This is a maintainability issue*
  - Break OpenAPI specification into manageable and reusable components
    - This will improve the quality of your OpenAPI specification

# API Docs as Code
- Like Source Code:
  - Develop changes on a feature branch
  - Use Redoc CLI to verify OpenAPI Schema is valid
  - Use Redoc CLI to run lint rules to verify the quality of the OpenAPI schema
  - Use GitHub actions to verify Redoc CLI rules

# Redoc - What is it?
- Redoc is an Open Source ReactJS application which generates API documentation from OpenAPI specfications
  - Redoc is widely used and highly configurable
- Redoc CLI (Command Line Interface) is a companion tool for managing OpenAPI specifications
  - Can break up existing OpenAPI Specifications into file ref components
  - Can bundle file ref components into a single OpenAPI Specification for releases
  - Can apply lint rules to verify the schema and style rules
  - Can run a doc preview mode for development with live re-load
  - **See IDE extensions**