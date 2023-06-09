FROM maven:4.0.0

Run mvn clean package -DskipTests

FROM eclipse-temurin:8-jdk

COPY target/first-service-0.0.1-SNAPSHOT.jar first-service-1.0.0.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "first-service-1.0.0.jar"]