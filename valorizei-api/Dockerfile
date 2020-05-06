FROM openjdk:8-jdk-alpine

LABEL maintainer="Romildo Paiter <romildopaiter@gmail.com>"

EXPOSE 8080

# The application's jar file
ARG JAR_FILE=build/libs/valorizei-api-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} valorizei-api.jar

ENTRYPOINT ["java", "-jar", "valorizei-api.jar"]