# Java Team Collaboration Project

This repository follows a clearer Java package structure so a small team can work together more easily.

## Package layout

- `com.team.app` - application entry point and CLI/main logic
- `com.team.model` - domain objects and data transfer objects
- `com.team.service` - business logic and calculations
- `src/test/java` - automated tests

## Build and run

```bash
mvn compile
mvn test
mvn exec:java -Dexec.mainClass="com.team.app.JavaTeamApp"
```

## Team workflow

- Create a feature branch for each task or bug fix
- Keep each package focused on one concern
- Add tests for new business logic
- Open a pull request before merging to `main`

## Example architecture

This starter project separates:
- the application startup code
- the business logic
- the data model

so the project stays cleaner as the team grows.
