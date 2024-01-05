FROM openjdk:17-jdk-alpine
# Copiez les fichiers de l'application
COPY . /app
WORKDIR /app

# Construisez l'application avec Maven
RUN ./mvnw clean install

# Utilisez une image JRE plus légère pour l'exécution

# Copiez le JAR construit dans l'image
#COPY --from=builder /app/target/*.jar /app/app.jar

# Exposez le port sur lequel l'application écoute
EXPOSE 8888

# Commande pour exécuter l'application au démarrage du conteneur
CMD ["java", "-jar", "/app/app.jar"]