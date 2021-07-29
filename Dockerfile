FROM openjdk:11-jdk-alpine
COPY EAPSample-0.0.1-SNAPSHOT.war EAPSample-0.0.1-SNAPSHOT.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","/EAPSample-0.0.1-SNAPSHOT.war"]
