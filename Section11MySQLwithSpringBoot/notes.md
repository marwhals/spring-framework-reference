# SQL notes and refresher - Using MySQL (owned by oracle)
- An RDMS
  - Supports ANSI/ISO SQL standard
- Written in C and C++ making it portable across many platforms 💡💡💡💡💡💡💡💡💡
- MySQL is very fast, stable and scalable
- MySQL clients for most popular langauges

## Features
- Stored Procedures
- Triggers
- Cursors
- Updated Views
- Query Cache
- Subselects

## MySQL Features
- ACID Compliance *refresher*
  - Atomicity - all or nothing
  - Consistency - transactions are valid to rule of the DB
  - Isolation - Results of transactions are done end to end
  - Durability - Once a transaction is commited, it remains so

## MySQL Editions
- Open Source under GPL
  - Community support only
- MySQL standard edition - 2k/year/server
  - Oracle support
  - Same as community but with Oracle support

## MySQL Enterprise Edition 
- 5k/yr/server
- Provides features for cluster routing and partitioning
- Includes Enterprise tooling for monitoring, backups and security
- Thread pooling for significant increase in performance under high loads

### MySQL cluster CGE
- 10k/year/server
  - Designed for near linear scalability through clustering
  - High volume, highly available

### Installation options
- MS Windows, macOS, Linux, Solaris/Unix, Free(BSD)
- Can also use docker 😎
- MySQL Workbench - GUI interface for MySQL but not required 😎

# MySQL and Spring Boot
- Connectivity to MySQL is managed via a JDBC Driver
- All major rrelational databases have a database specific driver
- MySQL was chosen for populatrity and its free use
- Configuration steps for other databases will be roughly the same
  - JDBC is a common API abstraction
    - Vendor specific options exist

# Setting up
1) Setup tables *using script*
2) Add dependency in maven for connector to respective DB
3) Add in spring boot properties file

# Notes on Hikari connection pool
- Database connections are very heavy
- Popular solution is the hikari connection pool

# Notes on Spring schema generation // See reference documentation for more details
- Autmoatically generated by hibernate
- Use case *rapid prototyping* 😎