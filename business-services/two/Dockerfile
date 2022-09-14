FROM java:8-jre-alpine
VOLUME /tmp
LABEL platform-services-group="platform-services"
LABEL description="Contains apigateway and discovery modules"
COPY feign-client-0.0.1-SNAPSHOT.jar /feign-client-0.0.1-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/eureka-server-0.0.1-SNAPSHOT.jar"]
