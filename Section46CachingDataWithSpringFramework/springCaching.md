# Caching

## When to use caching
- Caching is best for Read operations
- Ideal for data that does not change a lot
- Can make a significant reduction in workload for heavy read operations

## When not to use caching
- Mostly transactional systems
- When data is frequently updated
- When data gets updated by external systems

## Types of caches
- Local
  - Local to the JVM or machine code, only used for traffic on that machine
  - Fastest
- Distributed Cache
  - One or more machines networked together using pooled real memory
  - Still fast and efficient
  - Cache is shared between many cache consumers

## Caching with Spring
- Spring Framework support for Caching
  - Simple - Java ConcurrentHashMap
  - JRS-107 Java Caching API - Ehcache 2, Hazelcast, Ininispan
  - In memory databases - Couchbase, Redis
  - None - No-op cache

