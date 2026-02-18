# Use Java 17 JDK
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy Maven files first
COPY pom.xml .
COPY src ./src

# Copy the built jar (check target folder for exact name)
COPY target/characternnectionsbackend-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]