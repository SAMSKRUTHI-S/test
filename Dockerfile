
# Stage 1: Build Java application using Maven
FROM maven:3.9.9-eclipse-temurin-17 AS build

WORKDIR /app

# Copy Maven configuration
COPY pom.xml .

# Copy Java source code
COPY src ./src

# Compile and package the application
RUN mvn -B clean package -DskipTests

# Stage 2: Run application using Java 17
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy generated JAR file
COPY --from=build /app/target/*.jar app.jar

# Run the Java application
ENTRYPOINT ["java", "-cp", "app.jar", "com.example.tempe.App"]
