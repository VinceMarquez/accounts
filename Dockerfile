FROM openjdk:22
ARG JAR_FILE=target/*.jar
COPY ./target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/accounts-0.0.1-SNAPSHOT.jar"]