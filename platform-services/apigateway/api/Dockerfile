FROM java:8-jre-alpine
VOLUME /tmp
LABEL platform-services-group="platform-services"
LABEL description="Contains ui and api modules"
COPY api.war /api.war
EXPOSE 8081
ENTRYPOINT ["java", "-war", "/api.war"]
