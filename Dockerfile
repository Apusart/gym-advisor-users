FROM gradle:jdk19-alpine as gradle
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

FROM openjdk:19-jdk-alpine
EXPOSE 8080
COPY --from=gradle /home/gradle/src/build/libs/gym-grinder-users-0.0.1.jar /app/
RUN apk --no-cache add curl
RUN echo "java -XX:+UnlockExperimentalVMOptions -Djava.security.egd=file:/dev/./urandom -jar /app/gym-grinder-users-0.0.1.jar" > /app/run.sh
RUN chmod +x /app/run.sh
ENTRYPOINT ["/bin/sh", "-c", "/app/run.sh"]
