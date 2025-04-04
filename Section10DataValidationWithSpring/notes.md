# Validation overview
- Validation is a process of making assertions against data to ensure data integrity
- Is a value required? How long is a phone number?
- Is it a good date? What is the maximum length of a string?
- Some refer to data validation as *defensive programming *
- Or a process to *trust but verify*

# When to validate?
- Validate early and often
- Validation should occur with every exchange 🤔
- **User input data should be validated in the UI with rich user feedback**
- **RESTful API data should be validated early in the controller, before the service layer.**
- Data should be validated before persistence to the database
- Database constraints will also enforce data validation
- Best to validate early - Persistence errors are ugly to handle

# Java Bean validation
- Java Bean Validation is a Java API standard
- Provides for a standard way of performing validation and handling errors
- More graceful than custom code blocks of if.....the...... throw exception.
- Bean Validation is an API, like JPA or JDBC you need an implementation.

# Built In Constraint Definitions
- @Null - Check value is null
- @NotNull - Checks value is not null
- @AssertTrue - Value is true
- @AssertFalse - Value is false
- @Min - Number is equal or higher
- @Max - Number is equal or less

# Built In Constraint Definitions
- @DecimalMin - Value is larger
- @DecimalMax - Value is less than
- @Negative - Value is less than zero. Zero invalid
- @NegativeOrZero - Value is zero or less than zero
- @Positive - Value is greater than zero. Zero invalid.
- @PositiveOrZero - Value is zero or greater than zero
- @Size - check if string or collection is between a min and max
- @Digits - check for integer digits and fraction digits
- @Past - Checks if date is in past
- @PastOrPresent - Checks if data is in past or present
- @Future - Check if data is in future
- @FutureOrPresent - Check if date is present or in future
- @Pattern - checks against RegEx pattern
- @Digits - check for integer digits and fraction digits
- @Past - Checks if data in past
- @PastOrPresent - Checks if date is in past or present
- @Future - Checks if date is in future
- @FutureOrPresent - Checks if date is present or in future
- @Pattern - checks against RegEx pattern
- @NotEmpty - Checks if value is not null or not empty (whitespace characters or empty collection)
- @NonBlank - Checks string is not null or not whitespace characters
- @Email - Check is string value is an email address

# Hibernate Validator Constraints
- @ScriptAssert - Class level annotation, checks class against script
- @CreditCardNumber - Verifies value is a credit card number
- @Currency - Valid currency amount
- @DurationMax - Duration less than given value
- @DurationMin - Duration greater than given value
- @EAN - Valid EAN barcode
- @ISBN - Valid ISBN value
- @Length - String length between min and max
- @CodePointLength - Validates code point length of the annotated character sequence is between min and max included
- @LuhnCheck - Luhn check sum
- @Mod10Check - Mod 10 check sum
- @Mod11Check - Mod 11 check sum
- @Range - check is number is between given min and max (inclusive)
- @SafeHtml - Check for safe HTML
- @UniqueElements - Checks if collection has unique elements
- @Url - check for valid URL
- @CNPJ - Brazilian Corporate Tax Payer Registry Number ༼ つ ◕_◕ ༽つ
- @CPF - Brazilian Individual Taxpayer Registry Number........¯\_(ツ)_/¯ //Why in a library?
- @TituloEleitoral - Brazilian voter ID
- @NIP - Polish VAR ID
- @PESEL - Polish National Validation Number
- @REGON - Polish Taxpayer ID

[//]: # (.......TODO chatGPT for more......)

# Validation and Spring Framework
- Spring Framework has robust support for bean validation
- Validation support can be used in controllers and services and other Spring managed components
- Spring MVC will return a 400 Bad Reqeust Error for validation failures
- Spring Data JPA with throw an exception for JPA constraint violations

# Spring Boot and Validation
- Spring Boot will autoconfigure validation when the validation implementation is found on classpath
  - If API is only on classpath (with no implementation) you can use the annotations, BUT validation will NOT occur ⁉⁉⁉
- Prior to Spring Boot 2.3, validation was included in starter dependencies
  - After Spring Boot 2.3, you must include the Spring Boot validation starter