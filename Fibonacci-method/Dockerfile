# Step 1: Uses an official OpenJDK runtime environment as a parent image
FROM eclipse-temurin:17-jre-alpine

# Step 2: Sets the working directory inside the container
WORKDIR /app

# Step 3: Copies the compiled JAR file from my target folder into the container
COPY target/Fibonacci-method-1.0-SNAPSHOT.jar app.jar

# Step 4: Run the Java application when the container starts
CMD ["java", "-cp", "app.jar", "org.example.Main"]