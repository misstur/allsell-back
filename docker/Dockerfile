FROM openjdk:11.0.12-jre

ENV TZ Australia/Sydney

ARG JAR_FILE=build/libs/allsell-back-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080