FROM openjdk:8-jdk-alpine
LABEL maintainer "Jonathan Carrillo <jcarrillo@nisum.com>"

EXPOSE 8080

COPY build/libs/blog-0.1.0.jar /usr/src/BlogRepo/blog.jar
WORKDIR /usr/src/BlogRepo

ENTRYPOINT java -jar blog.jar