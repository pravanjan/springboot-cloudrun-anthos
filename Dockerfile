FROM openjdk:8-alpine
EXPOSE 8080
ADD /build/libs/springbootwithgradle.war app.war
ENTRYPOINT ["java", "-jar", "app.war"]


