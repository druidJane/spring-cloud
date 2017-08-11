FROM java:7
VOLUME /tmp
ADD config-client-0.0.1-SNAPSHOT.jar /app/config-client.jar
RUN bash -c 'touch /app/config-client.jar'
EXPOSE 7001
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/config-client.jar"]