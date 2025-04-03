# Lombok

*Useful for reducing spring boiler plate*

## What is Project Lombok
- Blah blah boilerplate
  - Getters and Setters
- Project Lombok provides annotations which help eliminate the writing of ceremonial code
- @Getter - generates getters
- @Setter - generated setters
- Using Project Lombok will save time and provide cleaner code

## How Lombok Works
- Hooks in via the Annotation processor API
- The AST (raw source code) is passed to Lombok from code generation before Java continues
- Thus, produces properly compiled Java code in conjunction with the Java compiler
- NOTE: Code is generated and compiled. No run-time performance penalty
- If you write an implantation of a method Project Lombok would generate, you code is used
  - Make it easy to override Lombok generated code
  - Example: custom setters

## Project Lombok and IDEs
- Since compiled code is change and source files are not, IDE's can get confused
- More of an issue for IDEs several years old
- Modern IDEs such a IntelliJ support this
- Plugin Installation may be necessary

## Project Lombok Features
- val - declares final local variable
- var - declares mutable local variable
- @Getter
  - Creates getter methods for all properties
- @Setter
  - Creates setter for all non-final properties
- @ToString
  - Generates String of class name and each field separated by commas
  - Optional parameters to include field names
  - Optional parameter to include call to the super toString method
- @EqualsAndHashCode
  - Generates implementations of 'equals(Object other)' and hashCode()
  - By default will use all non-static, non-transient properties
  - Can optionally exclude specific properties
- @NoArgsConstructor
  - Generates no args constructor
  - Will cause compiler to error if there are final fields
  - Can optionally force, which will initialise final field with 0 / false / null
- @RequiredArgsConstructor
  - Generates a constructor for all fields that are final or marked @NonNull
  - Constructor will throw a NullPointerException if any @NonNull fields are null
- @Data
  - Generates typical boilerplate code for POJOs
  - Combines - @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor
  - No constructor is generated if constructors have been explicitly declared
- @Value
  - The immutable variant of @Data
  - All fields are made private and final by default
- @NonNull
  - Set on parameter of method or constructor and a NullPointerException will be thrown if parameter is null
- @Builder
  - Implements the 'builder' pattern for object creation
  - `Person.builder().name("Tim Something").city("San Francisco").job("Mythbusters").job("Unchained Reaction").build();`
- @SneakyThrows
  - Throw checked exceptions without declaring in calling method's throws clause
- @Synchornized
  - A safer implementation of Java's synchronized
- @Log
  - Creates a Java util logger
  - Java util loggers are awful
- @Slf4j
  - Creates a SLF4J logger.
  - Recommended - SLF4J is a generic logging facade
  - Spring Boot's default logger is LogBack

# Delombok
## *Very useful tool in IDE (probably IntelliJ)* to see what code is being written