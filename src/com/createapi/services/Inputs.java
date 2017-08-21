package com.createapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Inputs {

	public static String inputNameProject(Scanner in) {
		
		System.out.println("Digite o nome do projeto (Primeira letra em Maiúsculo):");
		String nameProject = in.next();
		
		return nameProject;
	}

	public static String inputPathProject() {

		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new java.io.File("."));
		chooser.setDialogTitle("Selecione o diretorio do seu projeto");
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setAcceptAllFileFilterUsed(false);

		if (chooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
			System.out.println("Necessário selecionar o caminho do projeto!");
		}

		return chooser.getSelectedFile().toString();
	}

	public static int inputAmountModels(Scanner in) {
		
		System.out.println("Quantas entidades serão criadas?");
		int amountModels = in.nextInt();
		
		return amountModels;
	}

	public static List<String> inputNameModels(Scanner in, int amountModels) {

		List<String> listModels = new ArrayList<>();

		for (int i = 0; i < amountModels; i++) {
			System.out.println("Qual nome da " + (i + 1) + "º entidade? (Primeira letra em Maiúsculo)");
			listModels.add(in.next());
		}

		return listModels;
	}

}
