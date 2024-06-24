FROM maven:3.8.1-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM openjdk:22
WORKDIR /app
COPY --from=build /app/target/accounts-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]