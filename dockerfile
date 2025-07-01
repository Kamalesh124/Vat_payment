# ─── STAGE 1: BUILD ─────────────────────────────────────────────────────────────
FROM maven:3.8.8-eclipse-temurin-17-alpine AS build

WORKDIR /app
COPY pom.xml .
COPY src ./src

# Build the executable jar
RUN mvn clean package -DskipTests

# ─── STAGE 2: RUNTIME ───────────────────────────────────────────────────────────
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy the jar from the build stage
COPY --from=build /app/target/vat_payment-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app listens on
EXPOSE 8081

# Launch the application
ENTRYPOINT ["java", "-jar", "app.jar"]
