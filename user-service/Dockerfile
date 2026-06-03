

FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY target/user-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]

# # Stage 1 - Build application
# FROM maven:3.9.6-eclipse-temurin-21 AS build

# WORKDIR /app

# COPY . .

# RUN mvn clean package -DskipTests

# # Stage 2 - Run application
# FROM eclipse-temurin:21-jdk-alpine

# WORKDIR /app

# COPY --from=build /app/target/user-service-0.0.1-SNAPSHOT.jar app.jar

# EXPOSE 8080

# ENTRYPOINT ["java","-jar","app.jar"]