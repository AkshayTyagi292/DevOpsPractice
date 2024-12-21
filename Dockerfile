# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the local Java file into the container
COPY . .

# Compile the Java file
RUN javac hello.java

# Run the Java program
CMD ["java", "hello"]
fdsffdfggdfgsghfghghsfhfgbfghfvfghbfgtfgbfghbfgv