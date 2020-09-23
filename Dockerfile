FROM openjdk:8
ADD target/docker-spring-boot-app.jar docker-spring-boot-app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "docker-spring-boot-app.jar"]