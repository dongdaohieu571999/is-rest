#FROM openjdk:8-jdk-alpine as build
#RUN mkdir /is_rest_docker
#WORKDIR /is_rest_docker
#COPY . .


FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/build/libs/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
