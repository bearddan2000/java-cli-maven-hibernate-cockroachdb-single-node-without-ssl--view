FROM maven:3-openjdk-17

WORKDIR /usr/src/mymaven

COPY bin .

RUN mvn clean install compile exec:java

CMD [""]