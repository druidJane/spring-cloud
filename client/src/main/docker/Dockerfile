FROM java:7
VOLUME /tmp
RUN mkdir /app
ADD client-0.0.1-SNAPSHOT.jar /app/client.jar
ADD runboot.sh /app/
RUN bash -c 'touch /app/client.jar'
WORKDIR /app
RUN chmod a+x runboot.sh
EXPOSE 8080
CMD /app/runboot.sh