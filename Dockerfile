# Imagen base con JDK 17 (puedes cambiar según tu proyecto)
FROM openjdk:17-jdk-slim

# Argumento para el jar
ARG JAR_FILE=target/*.jar

# Copiamos el jar al contenedor
COPY ${JAR_FILE} app.jar

# Exponemos el puerto
EXPOSE 8080

# Comando para correr la app
ENTRYPOINT ["java", "-jar", "/app.jar"]