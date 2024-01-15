# Use an official OpenJDK runtime as a parent image
FROM openjdk:latest

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Compile the Java code
RUN javac SumOfDigits.java

# Command to run the Java program
CMD ["java", "SumOfDigits"]
