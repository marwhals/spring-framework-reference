# Lombok best practices
- What is it? A library which uses annotation processing to hook into the compile process to generate source code prior to compilation.
  - Save you from a lot ceremonial boilerplate code
- Use @SLF4J - to add a logger to your classes
  - Use SLF4J over native loggers for compatibility
- Use @Data on POJOs and use with *caution* on entities with bi-directional relationships
- Use @Builder on POJOs and Entities (can be challenging with inheritance)
- Use @RequriedArgsConstructor for constructor based Dependency injection
- Combine Project Lombok with MapStruct 😱 for type conversions