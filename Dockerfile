FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ADD target/meta-api-0.0.1-SNAPSHOT-exec.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=0.0.0.0:8787,suspend=n"
#ENV JAVA_OPTS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8787"
ENV SPRING_PROFILES_ACTIVE "docker"
EXPOSE 8080 8787
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=$SPRING_PROFILES_ACTIVE -jar /app.jar" ]
