#Image from amazoncorretto
FROM amazoncorretto:21

#Se monto un volumen para guardar los logs
VOLUME /tmp


# Copiar todos los archivos .jar del directorio target al contenedor.
COPY /workspace/target/*.jar /app.jar

# Ejecutar la aplicación con el perfil especificado
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=default", "/app.jar"]
