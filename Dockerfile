FROM eclipse-temurin:21-jdk-alpine as build
WORKDIR /app
COPY . .
RUN ./gradlew clean build -x test
COPY ./build/libs/catalog-0.0.1-SNAPSHOT.jar app.jar

FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/app.jar app.jar
EXPOSE 8110
ENTRYPOINT ["java", "-jar", "app.jar"]
