FROM java:7
VOLUME /tmp
RUN mkdir /app
ADD server-0.0.1-SNAPSHOT.jar /app/server.jar
ADD runboot.sh /app/
RUN bash -c 'touch /app/server.jar'
WORKDIR /app
RUN chmod a+x runboot.sh
EXPOSE 1111
CMD /app/runboot.sh