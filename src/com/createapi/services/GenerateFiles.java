package com.createapi.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateFiles {

	public static void generateApplicationProperties(String path) {

		try {

			File applicationProperties = new File(path + "/application.properties");

			BufferedWriter writer = new BufferedWriter(new FileWriter(applicationProperties));

			writer.write("spring.datasource.driverClassName=");
			writer.newLine();
			writer.write("spring.datasource.url=");
			writer.newLine();
			writer.write("spring.datasource.username=");
			writer.newLine();
			writer.write("spring.datasource.password=");
			writer.newLine();
			writer.write("spring.jpa.hibernate.ddl-auto=");
			
			writer.close();
			
		} catch (IOException e) {
			e.getMessage();
		}

	}
	
	public static void generatePomXml(String nameProject, String path) {
		
		String springVersion = "1.4.2";
		String javaVersion = "1.8";

		try {

			File pom = new File(path + "/pom.xml");
			BufferedWriter pomWriter = new BufferedWriter(new FileWriter(pom));

			pomWriter.write("<?xml version='1.0' encoding='UTF-8'?>");
			pomWriter.newLine();
			pomWriter.write("<project xmlns='http://maven.apache.org/POM/4.0.0' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'");
			pomWriter.newLine();
			pomWriter.write("	xsi:schemaLocation='http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd'>");
			pomWriter.newLine();
			pomWriter.newLine();
			pomWriter.write("	<modelVersion>4.0.0</modelVersion>");
			pomWriter.newLine();
			pomWriter.newLine();
			pomWriter.write("	<groupId>com."+ nameProject.toLowerCase() +"</groupId>");
			pomWriter.newLine();
			pomWriter.write("	<artifactId>" + nameProject.toLowerCase() + "</artifactId>");
			pomWriter.newLine();
			pomWriter.write("	<version>0.0.1-SNAPSHOT</version>");
			pomWriter.newLine();
			pomWriter.write("	<packaging>jar</packaging>");
			pomWriter.newLine();
			pomWriter.newLine();
			pomWriter.write("	<name>" + nameProject.toLowerCase() + "</name>");
			pomWriter.newLine();
			pomWriter.write("	<description>Projeto gerado por AutoGenerator</description>");
			pomWriter.newLine();
			pomWriter.newLine();
			pomWriter.write("	<parent>");
			pomWriter.newLine();
			pomWriter.write("		<groupId>org.springframework.boot</groupId>");
			pomWriter.newLine();
			pomWriter.write("		<artifactId>spring-boot-starter-parent</artifactId>");
			pomWriter.newLine();
			pomWriter.write("		<version>"+ springVersion + ".RELEASE</version>");
			pomWriter.newLine();
			pomWriter.write("		<relativePath />");
			pomWriter.newLine();
			pomWriter.write("	</parent>");
			pomWriter.newLine();
			pomWriter.newLine();
			pomWriter.write("	<properties>");
			pomWriter.newLine();
			pomWriter.write("		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>");
			pomWriter.newLine();
			pomWriter.write("		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>");
			pomWriter.newLine();
			pomWriter.write("		<java.version>" + javaVersion  + "</java.version>");
			pomWriter.newLine();
			pomWriter.write("	</properties>");
			pomWriter.newLine();
			pomWriter.write("	<dependencies>");
			pomWriter.newLine();
			pomWriter.newLine();
			pomWriter.write("		<dependency>");
			pomWriter.newLine();
			pomWriter.write("			<groupId>org.springframework.boot</groupId>");
			pomWriter.newLine();
			pomWriter.write("			<artifactId>spring-boot-starter</artifactId>");
			pomWriter.newLine();
			pomWriter.write("		</dependency>");
			pomWriter.newLine();
			pomWriter.newLine();
			pomWriter.write("		<dependency>");
			pomWriter.newLine();
			pomWriter.write("			<groupId>org.springframework.boot</groupId>");
			pomWriter.newLine();
			pomWriter.write("			<artifactId>spring-boot-starter-test</artifactId>");
			pomWriter.newLine();
			pomWriter.write("			<scope>test</scope>");
			pomWriter.newLine();
			pomWriter.write("		</dependency>");
			pomWriter.newLine();
			pomWriter.newLine();
			pomWriter.write("		<dependency>");
			pomWriter.newLine();
			pomWriter.write("			<groupId>org.springframework.boot</groupId>");
			pomWriter.newLine();
			pomWriter.write("			<artifactId>spring-boot-starter-data-jpa</artifactId>");
			pomWriter.newLine();
			pomWriter.write("			<scope>test</scope>");
			pomWriter.newLine();
			pomWriter.write("		</dependency>");
			pomWriter.newLine();
			pomWriter.newLine();
			pomWriter.write("		<dependency>");
			pomWriter.newLine();
			pomWriter.write("			<groupId>org.springframework.boot</groupId>");
			pomWriter.newLine();
			pomWriter.write("			<artifactId>spring-boot-starter-web</artifactId>");
			pomWriter.newLine();
			pomWriter.write("			<scope>test</scope>");
			pomWriter.newLine();
			pomWriter.write("		</dependency>");
			pomWriter.newLine();
			pomWriter.newLine();
			pomWriter.write("		<dependency>");
			pomWriter.newLine();
			pomWriter.write("			<groupId>org.springframework.boot</groupId>");
			pomWriter.newLine();
			pomWriter.write("			<artifactId>spring-boot-starter-actuator</artifactId>");
			pomWriter.newLine();
			pomWriter.write("			<scope>test</scope>");
			pomWriter.newLine();
			pomWriter.write("		</dependency>");
			pomWriter.newLine();
			pomWriter.newLine();
			pomWriter.write("		<dependency>");
			pomWriter.newLine();
			pomWriter.write("			<groupId>org.springframework.boot</groupId>");
			pomWriter.newLine();
			pomWriter.write("			<artifactId>spring-boot-starter-thymeleaf</artifactId>");
			pomWriter.newLine();
			pomWriter.write("			<scope>test</scope>");
			pomWriter.newLine();
			pomWriter.write("		</dependency>");
			pomWriter.newLine();
			pomWriter.newLine();
			pomWriter.write("		<dependency>");
			pomWriter.newLine();
			pomWriter.write("			<groupId>org.springframework.boot</groupId>");
			pomWriter.newLine();
			pomWriter.write("			<artifactId>spring-boot-devtools</artifactId>");
			pomWriter.newLine();
			pomWriter.write("			<scope>test</scope>");
			pomWriter.newLine();
			pomWriter.write("		</dependency>");
			pomWriter.newLine();
			pomWriter.newLine();
			pomWriter.write("	</dependencies>");
			pomWriter.newLine();
			pomWriter.newLine();
			pomWriter.write("	<build>");
			pomWriter.newLine();
			pomWriter.write("		<plugins>");
			pomWriter.newLine();
			pomWriter.write("			<plugin>");
			pomWriter.newLine();
			pomWriter.write("				<groupId>org.springframework.boot</groupId>");
			pomWriter.newLine();
			pomWriter.write("				<artifactId>spring-boot-maven-plugin</artifactId>");
			pomWriter.newLine();
			pomWriter.write("			</plugin>");
			pomWriter.newLine();
			pomWriter.write("		</plugins>");
			pomWriter.newLine();
			pomWriter.write("	</build>");
			pomWriter.newLine();
			pomWriter.newLine();
			pomWriter.write("</project>");

			pomWriter.close();

		} catch (Exception e) {

		}

	}

	public static void generateIndexHtml(String path) {
		
		try {

			File applicationProperties = new File(path + "/index.html");

			BufferedWriter writer = new BufferedWriter(new FileWriter(applicationProperties));

			writer.write("<!DOCTYPE html>");
			writer.newLine();
			writer.write("<html>");
			writer.newLine();
			writer.write("<head>");
			writer.newLine();
			writer.newLine();
			writer.write("	<title> AutoGenerator </title>");
			writer.newLine();
			writer.newLine();
			writer.write("</head>");
			writer.newLine();
			writer.write("<body>");
			writer.newLine();
			writer.write("<h1>Auto Generator!</h1>");
			writer.newLine();
			writer.write("</body>");
			writer.newLine();
			writer.write("</html>");
			
			writer.close();
			
		} catch (IOException e) {
			e.getMessage();
		}		
	}

	public static void generateAppJs(String path) {
		
		try {

			File applicationProperties = new File(path + "/app.js");

			BufferedWriter writer = new BufferedWriter(new FileWriter(applicationProperties));

			writer.write("");
			
			writer.close();
			
		} catch (IOException e) {
			e.getMessage();
		}		
		
	}

	public static void generateAppCss(String path) {

		try {

			File applicationProperties = new File(path + "/app.css");

			BufferedWriter writer = new BufferedWriter(new FileWriter(applicationProperties));

			writer.write("");
			
			writer.close();
			
		} catch (IOException e) {
			e.getMessage();
		}	
		
	}

}
