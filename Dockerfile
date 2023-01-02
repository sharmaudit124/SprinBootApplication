FROM openjdk:11
EXPOSE 8080
ADD target/book-author-api.jar book-author-api.jar
ENTRYPOINT ["java", "-jar", "/book-author-api.jar"]
