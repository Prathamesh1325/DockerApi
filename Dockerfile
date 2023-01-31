FROM openjdk:13-jdk-alpine

ADD target/online_flat_rental-0.0.1-SNAPSHOT.jar online_flat_rental-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","online_flat_rental-0.0.1-SNAPSHOT.jar"]

