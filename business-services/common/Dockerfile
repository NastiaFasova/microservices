FROM java:8-jre-alpine
VOLUME /tmp
LABEL platform-services-group="business-services"
LABEL description="Contains common, one and two modules"
COPY common-0.0.1-SNAPSHOT.jar /common-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/common-0.0.1-SNAPSHOT.jar"]
