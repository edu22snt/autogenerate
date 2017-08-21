package com.createapi.services;

import java.io.File;
import java.util.Set;

public class GenerateProject {

	public static void generate(String nameProject, String pathProject, Set<String> set) {

		// projeto/
		File folderProject = GenerateFolders.generateRootFolder(pathProject, nameProject);

		// Gerando POM do projeto/pom.xml
		GenerateFiles.generatePomXml(nameProject, folderProject.getPath());

		// projeto/src
		File folderSrc = GenerateFolders.generateSrcFolder(folderProject);

		// projeto/src/main
		File folderSrcMain = GenerateFolders.generateMainFolder(folderSrc);

		// projeto/src/main/java
		File folderSrcMainJava = GenerateFolders.generateMainJavaFolder(folderSrcMain);

		// Gerando com no projeto/src/main/java/com/...
		GeneratePackages.generateCom(nameProject, folderSrcMainJava.getPath(), set);

		// projeto/src/main/resources
		File folderSrcMainResources = GenerateFolders.generateMainResourcesFolder(folderSrcMain);

		// Gerando properties da app em
		// projeto/src/main/resources/application.properties
		GenerateFiles.generateApplicationProperties(folderSrcMainResources.getPath());

		// projeto/src/main/resources/static
		File folderSrcMainResourcesStatic = GenerateFolders.generateStaticFolder(folderSrcMainResources);

		// projeto/src/main/resources/static/css
		File folderSrcMainResourcesStaticCss = GenerateFolders.generateStaticCssFolder(folderSrcMainResourcesStatic);

		// Gerando app.css do front em
		// projeto/src/main/resources/static/css/app.css
		GenerateFiles.generateAppCss(folderSrcMainResourcesStaticCss.getPath());

		// projeto/src/main/resources/static/js
		File folderSrcMainResourcesStaticJs = GenerateFolders.generateStaticJsFolder(folderSrcMainResourcesStatic);

		// Gerando app.js do front em
		// projeto/src/main/resources/static/js/app.js
		GenerateFiles.generateAppJs(folderSrcMainResourcesStaticJs.getPath());

		// projeto/src/main/resources/static/js/configs
		GenerateFolders.generateJsConfigFolder(folderSrcMainResourcesStaticJs);

		// projeto/src/main/resources/static/js/controllers
		GenerateFolders.generateJsControllerFolder(folderSrcMainResourcesStaticJs);

		// projeto/src/main/resources/static/js/directives
		GenerateFolders.generateJsDirectiveFolder(folderSrcMainResourcesStaticJs);

		// projeto/src/main/resources/static/js/filters
		GenerateFolders.generateJsFilterFolder(folderSrcMainResourcesStaticJs);

		// projeto/src/main/resources/static/js/interceptors
		GenerateFolders.generateJsInterceptorFolder(folderSrcMainResourcesStaticJs);

		// projeto/src/main/resources/static/js/services
		GenerateFolders.generateJsServicesFolder(folderSrcMainResourcesStaticJs);

		// projeto/src/main/resources/static/lib
		GenerateFolders.generateStaticLibFolder(folderSrcMainResourcesStatic);

		// projeto/src/main/resources/static/view
		GenerateFolders.generateStaticViewFolder(folderSrcMainResourcesStatic);

		// projeto/src/main/resources/templates
		File folderSrcMainResourcesTemplates = GenerateFolders.generateTemplateFolder(folderSrcMainResources);

		// Gerando index do front em
		// projeto/src/main/resources/templates/index.html
		GenerateFiles.generateIndexHtml(folderSrcMainResourcesTemplates.getPath());

		// projeto/src/test
		File folderSrcTest = GenerateFolders.generateTestFolder(folderSrc);

		// projeto/src/test/main
		File folderSrcTestJava = GenerateFolders.generateMainJavaFolder(folderSrcTest);

		// Gerando com no projeto/src/test/main/com/...
		GeneratePackagesTest.generateCom(nameProject, folderSrcTestJava.getPath(), set);

		// projeto/src/test/resources
		File folderSrcTestResources = GenerateFolders.generateMainResourcesFolder(folderSrcTest);

		// Gerando properties da app em
		// projeto/src/test/resources/application.properties
		GenerateFiles.generateApplicationProperties(folderSrcTestResources.getPath());
	}

}
