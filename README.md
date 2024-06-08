# Spring Boot Gradle Kotlin Template

This is a template repository for a Spring Boot application using Gradle and Kotlin.

## Requirements

- Java 17
- Gradle

## Running the Application

1. Build the project:
    ```bash
    ./gradlew build
    ```

2. Run the application:
    ```bash
    ./gradlew bootRun
    ```

3. Access the application at `http://localhost:8080/hello`.

## Project Structure

- `src/main/kotlin/com/example` - Main application source code.
- `src/main/resources` - Application resources.
- `src/test/kotlin/com/example` - Test source code.
- `src/test/kotlin/com/example/module` - Code related to module. We can have another module similar to this.

NOTE: This is not a multi-module project. It's single-module, intended to separate module based on package structures. 
