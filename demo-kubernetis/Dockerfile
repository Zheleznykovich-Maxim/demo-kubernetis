FROM ubuntu:latest
LABEL authors="max.zhalezniakovich"
RUN chmod +x mvnw
ADD target/*.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]