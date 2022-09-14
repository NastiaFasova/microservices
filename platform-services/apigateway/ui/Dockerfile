FROM java:8-jre-alpine
VOLUME /tmp
LABEL platform-services-group="platform-services"
LABEL description="Contains ui and api modules"
COPY ui.war /ui.war
EXPOSE 9090
ENTRYPOINT ["java", "-war", "/ui.war"]
