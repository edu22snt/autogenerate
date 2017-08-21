package com.createapi.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneratePackages {

	public static void generateCom(String nameProject, String path, List<String> listModels) {

		String pathCom = path + "/com/" + nameProject.toLowerCase();

		try {

			generateFolders(nameProject, pathCom);

			generateFileCorsFilter(pathCom);
			generateFileApplication(pathCom, nameProject);

			generateFileModels(listModels, pathCom, nameProject);
			generateFileControllers(listModels, pathCom, nameProject);
			generateFileServices(listModels, pathCom, nameProject);
			generateFileRepositories(listModels, pathCom, nameProject);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void generateFolders(String nameProject, String path) throws IOException {

		File dirJavaControllers = new File(path + "/controllers");
		dirJavaControllers.mkdirs();

		File dirJavaModels = new File(path + "/models");
		dirJavaModels.mkdirs();

		File dirJavaRepositories = new File(path + "/repositories");
		dirJavaRepositories.mkdirs();

		File dirJavaServices = new File(path + "/services");
		dirJavaServices.mkdirs();

	}

	private static void generateFileCorsFilter(String path) {

		try {

			File corsFilter = new File(path + "/CorsFilter.java");
			BufferedWriter corsFilterWriter = new BufferedWriter(new FileWriter(corsFilter));
			corsFilterWriter.close();

		} catch (IOException e) {
			e.getMessage();
		}
	}

	private static void generateFileApplication(String path, String nameProject) {

		String nameClass = nameProject + "Application";

		try {

			File app = new File(path + "/" + nameClass + ".java");
			BufferedWriter writer = new BufferedWriter(new FileWriter(app));

			writer.write("package com." + nameProject.toLowerCase() + ";");
			writer.newLine();
			writer.newLine();
			writer.write("import org.springframework.boot.SpringApplication;");
			writer.newLine();
			writer.write("import org.springframework.boot.autoconfigure.SpringBootApplication;");
			writer.newLine();
			writer.newLine();
			writer.write("@SpringBootApplication");
			writer.newLine();
			writer.write("public class " + nameClass + " {");
			writer.newLine();
			writer.write("	public static void main(String[] args) {");
			writer.newLine();
			writer.write("		SpringApplication.run(" + nameClass + ".class, args);");
			writer.newLine();
			writer.write("	}");
			writer.newLine();
			writer.newLine();
			writer.write("}");

			writer.close();

		} catch (Exception e) {
			e.getMessage();
		}
	}

	private static void generateFileModels(List<String> listModels, String path, String nameProject) {

		try {

			for (String string : listModels) {

				File model = new File(path + "/models" + "/" + string + ".java");
				BufferedWriter modelWriter = new BufferedWriter(new FileWriter(model));

				modelWriter.write("package com." + nameProject.toLowerCase() + ".models;");
				modelWriter.newLine();
				modelWriter.newLine();
				modelWriter.write("import javax.persistence.Entity;");
				modelWriter.newLine();
				modelWriter.newLine();
				modelWriter.write("@Entity");
				modelWriter.newLine();
				modelWriter.write("public class " + string + " {");
				modelWriter.newLine();
				modelWriter.newLine();
				modelWriter.write("}");

				modelWriter.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void generateFileControllers(List<String> listModels, String path, String nameProject) {

		try {

			for (String model : listModels) {

				File controller = new File(path + "/controllers" + "/" + model + "Controller.java");
				BufferedWriter controllerWriter = new BufferedWriter(new FileWriter(controller));

				controllerWriter.write("package com." + nameProject.toLowerCase() + ".controllers;");
				controllerWriter.newLine();
				controllerWriter.newLine();
				controllerWriter.write("import org.springframework.stereotype.Controller;");
				controllerWriter.newLine();
				controllerWriter.newLine();
				controllerWriter.write("@Controller");
				controllerWriter.newLine();
				controllerWriter.write("public class " + model + "Controller {");
				controllerWriter.newLine();
				controllerWriter.newLine();
				controllerWriter.write("}");

				controllerWriter.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void generateFileServices(List<String> listModels, String path, String nameProject) {

		try {

			for (String model : listModels) {

				File service = new File(path + "/services" + "/" + model + "Service.java");
				BufferedWriter serviceWriter = new BufferedWriter(new FileWriter(service));

				serviceWriter.write("package com." + nameProject.toLowerCase() + ".services;");
				serviceWriter.newLine();
				serviceWriter.newLine();
				serviceWriter.write("import org.springframework.stereotype.Service;");
				serviceWriter.newLine();
				serviceWriter.newLine();
				serviceWriter.write("@Service");
				serviceWriter.newLine();
				serviceWriter.write("public class " + model + "Service {");
				serviceWriter.newLine();
				serviceWriter.newLine();
				serviceWriter.write("}");

				serviceWriter.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void generateFileRepositories(List<String> listModels, String path, String nameProject) {

		try {

			for (String model : listModels) {

				File repository = new File(path + "/repositories" + "/" + model + "Repository.java");
				BufferedWriter repositorytWriter = new BufferedWriter(new FileWriter(repository));

				repositorytWriter.write("package com." + nameProject.toLowerCase() + ".repositories;");
				repositorytWriter.newLine();
				repositorytWriter.newLine();
				repositorytWriter.write("import org.springframework.data.jpa.repository.JpaRepository;");
				repositorytWriter.newLine();
				repositorytWriter.write("import org.springframework.stereotype.Repository;");
				repositorytWriter.newLine();
				repositorytWriter.newLine();
				repositorytWriter.write("import com." + nameProject.toLowerCase() + ".models." + model + ";");
				repositorytWriter.newLine();
				repositorytWriter.newLine();
				repositorytWriter.write("@Repository");
				repositorytWriter.newLine();
				repositorytWriter
						.write("public interface " + model + "Repository extends JpaRepository<" + model + ", Long> {");
				repositorytWriter.newLine();
				repositorytWriter.newLine();
				repositorytWriter.write("}");

				repositorytWriter.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
