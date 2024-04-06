FROM openjdk:8-jdk-alpine

USER root
ENV USER app

#COPY run.sh /
COPY ./target/*.jar /opt/docker/app/

RUN #chmod +x /run.sh
WORKDIR /opt/docker/app

#ENTRYPOINT ["/run.sh"]
ENTRYPOINT ["sh", "-c", "java -jar /opt/docker/app/ShutdownHook-1.0-SNAPSHOT.jar"]
