FROM openjdk:21-jdk-slim AS kycservice
EXPOSE 9091
ARG JAR_FILE=KYCService/target/KYCService-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} DB-Connector.jar
ENTRYPOINT ["java","-jar","/KYCService-0.0.1-SNAPSHOT.jar"]

#WORKDIR /
#COPY DB-Connector/target/DB-Connector-0.0.1-SNAPSHOT.jar build/
#WORKDIR DB-Connector/target/
#ENTRYPOINT ["java","-jar","/DB-Connector/target/DB-Connector-0.0.1-SNAPSHOT.jar"]