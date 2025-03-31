# 🛠️ Maven Cheat Sheet

## 🚀 Getting Started

### ✅ Verify Maven Installation
```bash
mvn -version
```
Shows Maven version, Java version, and environment details.

### ✅ Create a New Maven Project
```bash
mvn archetype:generate -DgroupId=com.example -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
- `groupId`: Package namespace (e.g., `com.example`)
- `artifactId`: Project name
- `archetype`: Template for the project

## 📦 Maven Lifecycle Phases

```bash
mvn validate      # Validate project structure
mvn compile       # Compile source code
mvn test          # Run tests
mvn package       # Package into JAR/WAR
mvn verify        # Verify the build
mvn install       # Install package into local repo
mvn deploy        # Deploy package to remote repo
```

## 🔍 Common Maven Commands

### ✅ Build the Project
```bash
mvn clean install
```
- `clean`: Removes the `target/` directory.
- `install`: Compiles, tests, and installs the package into the local repository.

### ✅ Run Tests
```bash
mvn test
```
Run unit tests.

### ✅ Skip Tests
```bash
mvn install -DskipTests
```
Build the project without running tests.

### ✅ Run the Application
For projects with the Maven `exec` plugin:
```bash
mvn exec:java -Dexec.mainClass="com.example.Main"
```

## 📄 Dependency Management

### ✅ Add a Dependency
In `pom.xml`:
```xml
<dependencies>
    <dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-lang3</artifactId>
        <version>3.12.0</version>
    </dependency>
</dependencies>
```
Then, run:
```bash
mvn install
```

### ✅ View Dependency Tree
```bash
mvn dependency:tree
```
Shows the entire dependency tree with versions.

### ✅ Force Dependency Update
```bash
mvn clean install -U
```
Forces Maven to update snapshots and dependencies.

## 🔧 Maven Plugins

### ✅ List Installed Plugins
```bash
mvn help:effective-pom
```

### ✅ Check Effective Configuration
```bash
mvn help:effective-settings
```

### ✅ Use a Specific Profile
```bash
mvn clean install -Pdev
```
Activates the `dev` profile.

## 🛠️ Configuration & Settings

### ✅ Check Java Version Maven Uses
```bash
mvn -version
```

### ✅ Force Maven to Use a Specific JDK
```bash
JAVA_HOME=/path/to/jdk mvn clean install
```

### ✅ Maven Wrapper
To make your project buildable without Maven installed:
```bash
mvn -N io.takari:maven:wrapper
```
Use:
```bash
./mvnw clean install
```

## 📊 Debugging & Troubleshooting

### ✅ Enable Debug Output
```bash
mvn clean install -X
```
Shows detailed logs.

### ✅ Check Dependencies Resolution Issues
```bash
mvn dependency:resolve
```

## 🔥 Maven Profiles
Profiles allow different configurations for dev, test, and production environments.

### ✅ Define Profiles in `pom.xml`:
```xml
<profiles>
    <profile>
        <id>dev</id>
        <activation>
            <activeByDefault>true</activeByDefault>
        </activation>
        <properties>
            <env>development</env>
        </properties>
    </profile>

    <profile>
        <id>prod</id>
        <properties>
            <env>production</env>
        </properties>
    </profile>
</profiles>
```
### ✅ Activate a Profile
```bash
mvn clean install -Pprod
```

## 📂 Repository Management

### ✅ Local Repository Path
By default, Maven uses:
```
~/.m2/repository
```

### ✅ Clear Local Repository Cache
```bash
mvn dependency:purge-local-repository
```

### ✅ Deploy to Remote Repository
```bash
mvn deploy
```

## 🔥 Useful Maven Goals
```bash
mvn dependency:analyze     # Analyze dependencies
mvn dependency:tree        # Show dependency tree
mvn site                   # Generate project reports
mvn help:describe -Dcmd=install   # Describe a goal
```

### 💡 Tips
- 🛠️ Use `mvn help:effective-pom` to see the complete configuration.
- ⚡ Use `-DskipTests` to skip tests and speed up builds.
- 🚀 Use `mvn dependency:tree` to detect version conflicts.