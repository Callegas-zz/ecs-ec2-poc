FROM openjdk:8u131-jdk-alpine

MAINTAINER Fellipe Callegas <callegas.f@gmail.com>

VOLUME /tmp
EXPOSE 8080

ARG JAR_FILE=build/libs/yoshi-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} yoshi.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/yoshi.jar"]

