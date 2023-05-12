FROM adoptopenjdk:11-jre-hotspot
COPY . /app
WORKDIR /app
CMD ["java", "-jar", "nome-do-seu-arquivo-jar.jar"]
