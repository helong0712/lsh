FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 11302
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo.jar"]