# Flyway
- Usecase: Manage database migrations

# Overview of Flyway
## What is a Migration?
- Migrations are the process of moving programing code from on system to another
  - This is a large and complicated area in application maintenance 😎
- Database migrations typically need to occur prior to or in conjunction with application code 😎
  - Can lead to run time errors if database does not match what is expected ⚡
- Database migrations are a very important part of the process of moving application code to production
- In larger projects this is not the developers responsibility 😌

## Why use a migration tool?
- Note: *Hibernate* is usable
- Use cases
  - Managing many environments and databases
    - Dev(H2), CI/CD, QA, UAT, Production
- Development and CI/CD data are easy, just rebuild each time
- QA, UAT, Production are permanent data bases
  - What state are they in?
  - Has a script been applied?
  - Hoe to create a new database to release?
- Database Migration tools can:
  - Create a new database
  - Hold history of migrations
  - Have a reproducible state of the database
  - Help manage changes being applied to database instances
- Popular Open Source Database Migration Tools (See jipppity for more)
  - Liquibase
  - Flyway

## Liquibase and Flyway
- Common Features:
  - Command Line Tools
  - Integration with Maven and Gradle
  - Spring Boot Integration
  - Use script files which can be versioned and tracked
  - Use database table to track changes
  - Have commercial support

- Spring Boot offers support for both Liquibase and Flyway
- Fundamentally Spring Boot will apply change sets
- Spring Boot's support is narrow in scope
- Both tools have additional capabilities available from the command line or build tool plugins
- The Spring Boot integration is convenient for migrations
  - Both tools may be used independently of Spring Boot

## Liquibase vs Flyway
- Liquibase and Flyway are very similar in terms of functionality
- Share same concepts, slightly different terminology
- Liquibase supports change scripts in SQL, XML, YAML and JSON
  - XML, YAML and JSON abstract SQL, which may be beneficial for different DB technologies
- Flyway supports SQL and Java only
- Liquibase is a larger and more robust product
- Flyway seems to have more popularity
- Both are mature and widely used

## Liquibase vs Flyway - Which to Use?
- Liquibase is probably a better solution for large enterprises with complex environments
- Flyway is good for 90% of applications which don't need the additional capabilities
- Recommendation
  - If one or the other is being used in the organisation, use it.
  - If in doubt *do some research🍭*

## Flyway Commands
- Migrate - Migrate latest version
- Clean - Drops all database objects - NOT FOR PROD (❁´◡`❁)
- Info - Prints info about migrations
- Validate - Validates applied migrations against available
- Undo - Reverts most recently applied migration
- Baseline - Baselines an existing database
- Repair - Used to fix problems with schema history table

## Running Flyway
- Command Line
- Maven / Gradle
- Spring Boot - Run Flyway on startup to update configured database to latest changeset

## Why Not Baseline?
- Baseline is for introducing Flyway to an existing database schema
  - Assumes database tables and objects will be there
- Can start from an empty DB