# Utiliza una imagen base de Maven para construir la aplicación
FROM jelastic/maven:3.9.6-openjdk-21.0.2-almalinux-9 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests
 
# Utiliza una imagen base de OpenJDK para ejecutar la aplicación
FROM openjdk:21-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]