package com.createapi.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneratePackagesTest {

	public static void generateCom(String nameProject, String path, List<String> listModels) {

		String pathCom = path + "/com/" + nameProject.toLowerCase();

		try {

			generateFolders(nameProject, pathCom);

			generateFileApplication(pathCom, nameProject);

			generateFileModels(listModels, pathCom, nameProject);
			generateFileControllers(listModels, pathCom, nameProject);
			generateFileServices(listModels, pathCom, nameProject);
			generateFileRepositories(listModels, pathCom, nameProject);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void generateFolders(String nameProject, String path) throws IOException {

		File dirJavaControllers = new File(path + "/controllers");
		dirJavaControllers.mkdirs();

		File dirJavaModels = new File(path + "/models");
		dirJavaModels.mkdirs();

		File dirJavaRepositories = new File(path + "/repositories");
		dirJavaRepositories.mkdirs();

		File dirJavaServices = new File(path + "/services");
		dirJavaServices.mkdirs();

	}

	public static void generateFileApplication(String path, String nameProject) {

		try {

			File app = new File(path + "/" + nameProject + "ApplicationTest.java");
			BufferedWriter appWriter = new BufferedWriter(new FileWriter(app));
			appWriter.close();

		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void generateFileModels(List<String> listModels, String path, String nameProject) {

		try {

			for (String string : listModels) {

				File model = new File(path + "/models" + "/" + string + "Test.java");
				BufferedWriter writer = new BufferedWriter(new FileWriter(model));
				writer.close();

			}

		} catch (Exception e) {
			e.getMessage();
		}

	}

	public static void generateFileControllers(List<String> listModels, String path, String nameProject) {

		try {

			for (String string : listModels) {

				File controller = new File(path + "/controllers" + "/" + string + "ControllerTest.java");
				BufferedWriter writer = new BufferedWriter(new FileWriter(controller));
				writer.close();

			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

	public static void generateFileServices(List<String> listModels, String path, String nameProject) {

		try {

			for (String string : listModels) {

				File service = new File(path + "/services" + "/" + string + "ServiceTest.java");
				BufferedWriter writer = new BufferedWriter(new FileWriter(service));
				writer.close();

			}

		} catch (Exception e) {
			e.getMessage();
		}

	}

	public static void generateFileRepositories(List<String> listModels, String path, String nameProject) {

		try {

			for (String string : listModels) {

				File repository = new File(path + "/repositories" + "/" + string + "RepositoryTest.java");
				BufferedWriter writer = new BufferedWriter(new FileWriter(repository));
				writer.close();

			}

		} catch (Exception e) {
			e.getMessage();
		}

	}

}
