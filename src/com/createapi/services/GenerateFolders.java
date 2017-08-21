package com.createapi.services;

import java.io.File;

public class GenerateFolders {

	public static File generateRootFolder(String pathProject, String nameProject) {

		File folderProject = new File(pathProject + "/" + nameProject);
		folderProject.mkdirs();
		return folderProject;
	}

	public static File generateSrcFolder(File folderProject) {

		File folderSrc = new File(folderProject.getPath() + "/src");
		folderSrc.mkdirs();
		return folderSrc;
	}

	public static File generateMainFolder(File folderSrc) {

		File folderSrcMain = new File(folderSrc.getPath() + "/main");
		folderSrcMain.mkdirs();
		return folderSrcMain;
	}

	public static File generateMainJavaFolder(File folderSrcMain) {

		File folderSrcMainJava = new File(folderSrcMain.getPath() + "/java");
		folderSrcMainJava.mkdirs();
		return folderSrcMainJava;
	}

	public static File generateMainResourcesFolder(File folderSrcMain) {

		File folderSrcMainResources = new File(folderSrcMain.getPath() + "/resources");
		folderSrcMainResources.mkdirs();
		return folderSrcMainResources;
	}

	public static File generateStaticFolder(File folderSrcMainResources) {

		File folderSrcMainResourcesStatic = new File(folderSrcMainResources.getPath() + "/static");
		folderSrcMainResourcesStatic.mkdirs();
		return folderSrcMainResourcesStatic;
	}

	public static File generateStaticCssFolder(File folderSrcMainResourcesStatic) {

		File folderSrcMainResourcesStaticCss = new File(folderSrcMainResourcesStatic.getPath() + "/css");
		folderSrcMainResourcesStaticCss.mkdirs();
		return folderSrcMainResourcesStaticCss;
	}

	public static File generateStaticJsFolder(File folderSrcMainResourcesStatic) {

		File folderSrcMainResourcesStaticJs = new File(folderSrcMainResourcesStatic.getPath() + "/js");
		folderSrcMainResourcesStaticJs.mkdirs();
		return folderSrcMainResourcesStaticJs;
	}

	public static void generateJsConfigFolder(File folderSrcMainResourcesStaticJs) {

		File folderSrcMainResourcesStaticJsConfigs = new File(folderSrcMainResourcesStaticJs.getPath() + "/configs");
		folderSrcMainResourcesStaticJsConfigs.mkdirs();
	}

	public static void generateJsControllerFolder(File folderSrcMainResourcesStaticJs) {

		File folderSrcMainResourcesStaticJsCtrl = new File(folderSrcMainResourcesStaticJs.getPath() + "/controllers");
		folderSrcMainResourcesStaticJsCtrl.mkdirs();
	}

	public static void generateJsDirectiveFolder(File folderSrcMainResourcesStaticJs) {

		File folderSrcMainResourcesStaticJsDirectives = new File(
				folderSrcMainResourcesStaticJs.getPath() + "/directives");
		folderSrcMainResourcesStaticJsDirectives.mkdirs();
	}

	public static void generateJsFilterFolder(File folderSrcMainResourcesStaticJs) {

		File folderSrcMainResourcesStaticJsFilters = new File(folderSrcMainResourcesStaticJs.getPath() + "/filters");
		folderSrcMainResourcesStaticJsFilters.mkdirs();
	}

	public static void generateJsInterceptorFolder(File folderSrcMainResourcesStaticJs) {

		File folderSrcMainResourcesStaticJsInterceptors = new File(
				folderSrcMainResourcesStaticJs.getPath() + "/interceptors");
		folderSrcMainResourcesStaticJsInterceptors.mkdirs();
	}

	public static void generateJsServicesFolder(File folderSrcMainResourcesStaticJs) {

		File folderSrcMainResourcesStaticJsServices = new File(folderSrcMainResourcesStaticJs.getPath() + "/services");
		folderSrcMainResourcesStaticJsServices.mkdirs();
	}

	public static void generateStaticLibFolder(File folderSrcMainResourcesStatic) {

		File folderSrcMainResourcesStaticLib = new File(folderSrcMainResourcesStatic.getPath() + "/lib");
		folderSrcMainResourcesStaticLib.mkdirs();
	}

	public static void generateStaticViewFolder(File folderSrcMainResourcesStatic) {

		File folderSrcMainResourcesStaticView = new File(folderSrcMainResourcesStatic.getPath() + "/view");
		folderSrcMainResourcesStaticView.mkdirs();
	}

	public static File generateTemplateFolder(File folderSrcMainResources) {

		File folderSrcMainResourcesTemplates = new File(folderSrcMainResources.getPath() + "/templates");
		folderSrcMainResourcesTemplates.mkdirs();
		return folderSrcMainResourcesTemplates;
	}

	public static File generateTestFolder(File folderSrc) {

		File folderSrcTest = new File(folderSrc.getPath() + "/test");
		folderSrcTest.mkdirs();
		return folderSrcTest;
	}

}
