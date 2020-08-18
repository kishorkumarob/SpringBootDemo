  
# Pull base image 
FROM adoptopenjdk/openjdk11:latest

# Maintainer 
MAINTAINER "kishorngr@gmail.com" 

# Copy to images tomcat path 
COPY target/springbootdemo-0.0.1-SNAPSHOT.jar /demo.jar

EXPOSE 8000
CMD ["java", "-jar", "/demo.jar"]
