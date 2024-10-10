FROM amazoncorretto:17-alpine-jdk
LABEL authors="dmitryhatsayuk"
EXPOSE 8080
COPY target/AutoriZ-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-jar","app.jar"]

