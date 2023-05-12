# Define a base image
FROM ubuntu:20.04

# Instala as dependências necessárias
RUN apt-get update && \
    apt-get install -y openjdk-11-jdk

# Define o diretório de trabalho
WORKDIR /app

# Copia os arquivos do projeto para o contêiner
COPY . .

# Compila o projeto
RUN javac -cp src src/Main.java

# Define o comando a ser executado ao iniciar o contêiner
CMD ["java", "-cp", "src", "Main"]
