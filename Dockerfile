FROM adoptopenjdk/openjdk11:latest
COPY EAPSample-0.0.1-SNAPSHOT.war EAPSample-0.0.1-SNAPSHOT.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","/EAPSample-0.0.1-SNAPSHOT.war"]
