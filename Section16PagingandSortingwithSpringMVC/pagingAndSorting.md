# What is paging and sorting
- Paging and Sorting refer to techinques for dealing with lists of data
- Paging is also refered to as pagination
- Example
  - First page is 25 results of thousands
  - Data on first page is ordered by "best search match"
- Clicking on next page says:
  - Give me the second page of the sorted data

# Paging in SQL
- By default most SQL databases will return the full data set for query
- Most GUI tools will set a default limit
- Large record sets can become problematic for performance and memory utilisation
  - Large record sets can become problematic for performance and memory utilisation
- In SQL the limit clause is used to limit the number of records returned
- In SQL the offset clause is used to move the starting point of the record set
- Second page of 25 would be limit 25 offset 25

# Sorting in SQL
- By default most SQL databases will not sort data
- When no sort is specified the order returned is not guaranteed to be the same query to query
  - Often the order will be the same, but beware it can change!
- Sorting is controlled by via the SQL order by clause
- One or more columns can be specified with sort order (asc or desc)
- Default order is ascending
- Example ```ORDER BY beerName ASC```

# Paging and Sorting with Spring Data JPA
- Spring Data JPA provides robust support for paging and sorting
- Spring Data JPA does not have a default limit on records returned
- Spring Data JPA does not set a default sort
- Only limit is memory of the JVM
- Returning several million records in a JSON response will consumer a lot of memory
  - Probably crashing the application
- Best practice is to set default limits for the number of records returned

# Paging and Sorting with Spring
- Paging and Sorting in Spring has an API in the Spring Data Commons project
- This API is used to define Paging and Sorting in the Spring Data family of projects
- Each Spring Data project provides its own implementation of this API
- This course will use the JPA version
- Techniques learned with the JPA version will be portable to other platform versions of Spring Data
- Spring Data JPA abstracts the paging and sorting to the JPA standard

# Paging and Sorting Core Components
- PageRequest - is a Java object used to describe the desired page of data
  - Includes the page number, page size and sort information
- Sort - Object describing how to sort the requested data
- Creating a PageRequest:
  - page number (zero based) and size (number of records)
    - Defaults to unsorted
  - page number, size and sort.

# Paging and Sorting Core Components
- Page - Is an interface describing the result of a paged query
  - content - list property containing requested page of data
  - Also has page number, size and sort information
  - Has utility methods to get next and previous Pageable

# Paging and Sorting with Spring Data JPA
- Paging and Spring with Spring Data JPA is simple to implement
- Query methods in Spring Data JPA will accept paging request information
- Query methods in Spring Data JPA will return paging information
- To implement paging and sorting on Spring Data JPA query methods
  - Add PageRequest as a parameter to the defined method
  - Use Page with generic of content type for the return type