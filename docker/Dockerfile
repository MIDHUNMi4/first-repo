FROM openjdk:17
ENV uname="midhun"

LABEL "version"="midhun 2.1"
ADD target/template-0.0.1-SNAPSHOT.jar demo.jar

ENTRYPOINT ["java", "-jar", "demo.jar"]
