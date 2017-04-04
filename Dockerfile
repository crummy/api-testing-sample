FROM openjdk:8u121-jdk
MAINTAINER Malcolm Crum www.malcolmcrum.com

COPY target/apitestingsample-1.0-SNAPSHOT.jar app.jar

CMD java -jar app.jar