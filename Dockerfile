# Start with a base image containing Java runtime
FROM openjdk:11-jre

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Add the application's jar to the container
COPY ./build/libs/ci-cd-ibm-demo.jar /ci-cd-ibm-demo.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/ci-cd-ibm-demo.jar"]