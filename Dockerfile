FROM openjdk:17
EXPOSE 9004
COPY target/spring-docker-3.jar spring-docker-3.jar
ENTRYPOINT ["java","-jar","/spring-docker-3.jar"]