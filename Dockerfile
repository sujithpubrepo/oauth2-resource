FROM adoptopenjdk/maven-openjdk11
COPY target/oauth2-resource-1.0.0.jar app.jar
EXPOSE 8074:8074
RUN apt-get update
RUN apt-get install -y gcc
RUN apt-get install -y curl
ENTRYPOINT ["java","-jar","app.jar"]