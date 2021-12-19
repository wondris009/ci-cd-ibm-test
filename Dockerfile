# Start with a base image containing Java runtime
FROM openjdk:11-jre

# Add a volume pointing to /tmp
VOLUME /tmp

# applicaiton port (server.port) mapping to outside of container
EXPOSE 8081

# Add the application's jar to the container
COPY ./build/libs/ci-cd-ibm-demo.jar /ci-cd-ibm-demo.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/ci-cd-ibm-demo.jar"]