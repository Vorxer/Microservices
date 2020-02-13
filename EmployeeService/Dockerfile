FROM openjdk:8-jdk-alpine
RUN apt-get update && apt-get install -y mysql-server
ARG JAR_FILE=target/EmployeeService-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} EmployeeService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/EmployeeService-0.0.1-SNAPSHOT.jar"]
