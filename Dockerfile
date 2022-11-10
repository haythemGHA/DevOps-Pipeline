FROM openjdk:8
ADD target/tpAchatProject-1.0.jar haythemproduit.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "haythemproduit.jar"]