FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/AllocationService-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} AllocationService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/AllocationService-0.0.1-SNAPSHOT.jar"]
