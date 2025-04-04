# Maven notes - *see more detailed resources*

- See documentation - Especially "A Build Lifecycle is Made Up of Phases"
- Use via the command line

- **Build Info** is very useful

# ChatGPT generated - Maven Cheat Sheet

A list of 50 commonly used Maven commands, helpful for navigating, building, and managing Java projects.

## 1. **Compile Project**
Compile the project's source code.
```bash
mvn compile
```

## 2. **Clean Project**
Remove the target directory where build artifacts are stored.
```bash
mvn clean
```

## 3. **Clean and Compile**
Cleans the project and then compiles the source code.
```bash
mvn clean compile
```

## 4. **Run Tests**
Run the unit tests in the project.
```bash
mvn test
```

## 5. **Run Tests with Clean**
Clean the project and run the unit tests.
```bash
mvn clean test
```

## 6. **Install Project**
Install the project to the local Maven repository (`~/.m2/repository`).
```bash
mvn install
```

## 7. **Package Project**
Package the project into its distributable format, such as a JAR or WAR file.
```bash
mvn package
```

## 8. **Skip Tests**
Compile and package the project but skip tests.
```bash
mvn package -DskipTests
```

## 9. **Validate Project**
Validate the project’s configuration.
```bash
mvn validate
```

## 10. **Site Generation**
Generate the project's site documentation.
```bash
mvn site
```

## 11. **Clean, Compile, and Package**
Clean the project, compile it, and package it.
```bash
mvn clean package
```

## 12. **Run with Debug Output**
Run Maven with debug output for more detailed logs.
```bash
mvn -X <goal>
```

## 13. **Run with Error Output**
Run Maven with error output for more detailed error logs.
```bash
mvn -e <goal>
```

## 14. **List Project Dependencies**
List the project's dependencies.
```bash
mvn dependency:tree
```

## 15. **Resolve Dependencies**
Resolve the project's dependencies.
```bash
mvn dependency:resolve
```

## 16. **Check Project's Artifact ID**
Check the artifact ID of the project.
```bash
mvn help:evaluate -Dexpression=project.artifactId
```

## 17. **Check Project's Version**
Check the version of the project.
```bash
mvn help:evaluate -Dexpression=project.version
```

## 18. **Generate JAR File**
Package the project as a JAR file.
```bash
mvn jar:jar
```

## 19. **Generate WAR File**
Package the project as a WAR file.
```bash
mvn war:war
```

## 20. **Clean and Install**
Clean the project and install it to the local Maven repository.
```bash
mvn clean install
```

## 21. **Build Project Without Running Tests**
Build the project without running tests.
```bash
mvn install -DskipTests
```

## 22. **Deploy Project**
Deploy the project to a remote repository.
```bash
mvn deploy
```

## 23. **Show Effective POM**
Show the effective POM (after inheritance and interpolation).
```bash
mvn help:effective-pom
```

## 24. **Display Project Information**
Show the project’s information.
```bash
mvn help:describe
```

## 25. **Run a Plugin Goal**
Run a specific plugin goal.
```bash
mvn <plugin>:<goal>
```

## 26. **List Available Plugins**
List all the available plugins for a project.
```bash
mvn help:effective-pom
```

## 27. **Run a Specific Profile**
Activate a specific profile in the project.
```bash
mvn clean install -P<profile>
```

## 28. **Run the Project**
Run a project with a specific command (if the project supports it).
```bash
mvn exec:java
```

## 29. **Download Project Dependencies**
Download all dependencies for the project.
```bash
mvn dependency:go-offline
```

## 30. **Show Plugin Versions**
Show the versions of plugins used in the project.
```bash
mvn help:effective-pom
```

## 31. **Run Maven with Specific JVM Options**
Set JVM options for running a goal.
```bash
mvn <goal> -DargLine="-Xmx512m"
```

## 32. **Install a Specific Artifact**
Install a specific artifact to the local repository.
```bash
mvn install:install-file -Dfile=<path-to-artifact> -DgroupId=<groupId> -DartifactId=<artifactId> -Dversion=<version> -Dpackaging=<type>
```

## 33. **Check for Dependency Updates**
Check for updates of project dependencies.
```bash
mvn versions:display-dependency-updates
```

## 34. **Create a Custom Site**
Generate a custom site for the project.
```bash
mvn site:deploy
```

## 35. **Generate Project's Dependency Graph**
Generate the project's dependency graph.
```bash
mvn dependency:tree
```

## 36. **Download Source Jars**
Download the source JARs for all project dependencies.
```bash
mvn dependency:sources
```

## 37. **Install Plugin**
Install a plugin to the local Maven repository.
```bash
mvn install:install-file -Dfile=<plugin-file> -DgroupId=<groupId> -DartifactId=<artifactId> -Dversion=<version> -Dpackaging=<type>
```

## 38. **Clean and Build**
Clean the project and build it.
```bash
mvn clean build
```

## 39. **Show Project Dependencies**
Show a list of project dependencies.
```bash
mvn dependency:list
```

## 40. **Run with Specific Property**
Run a Maven goal while specifying a property.
```bash
mvn clean install -Dproperty=value
```

## 41. **Execute a Specific Test**
Run a specific test class.
```bash
mvn -Dtest=<test-class> test
```

## 42. **Skip Tests for a Specific Goal**
Skip tests while executing a specific goal.
```bash
mvn <goal> -DskipTests
```

## 43. **Display the Version of Maven**
Display the version of Maven being used.
```bash
mvn -v
```

## 44. **Run Specific Tests (Multiple)**
Run specific tests or a group of tests.
```bash
mvn -Dtest="TestClassName#methodName" test
```

## 45. **Check for Outdated Dependencies**
Check for outdated dependencies in your project.
```bash
mvn versions:display-plugin-updates
```

## 46. **Show Plugin Details**
Show details of a specific plugin.
```bash
mvn plugin:describe -Dplugin=<plugin-name>
```

## 47. **Run Maven from a Specific Directory**
Run Maven commands from a specific directory.
```bash
mvn -f /path/to/pom.xml <goal>
```

## 48. **Run in Parallel**
Run multiple Maven tasks in parallel.
```bash
mvn -T 2C <goal>
```

## 49. **Create a New Maven Archetype Project**
Create a new project based on a Maven archetype.
```bash
mvn archetype:generate -DgroupId=com.example -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart
```

## 50. **Update Project Dependencies**
Update the project's dependencies to the latest versions.
```bash
mvn versions:use-latest-versions
```

---

## Conclusion

This cheat sheet covers the essential Maven commands you'll use on a daily basis. Whether you're managing dependencies, building, testing, or deploying, these commands will help you streamline your workflow. Keep it handy for quick reference!
