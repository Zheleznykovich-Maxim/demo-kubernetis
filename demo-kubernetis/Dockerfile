FROM ubuntu:latest
LABEL authors="max.zhalezniakovich"
ADD target/*.jar app.jar
RUN chmod +x mvnw
RUN sh -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]