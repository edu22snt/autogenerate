package com.createapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inputs {

	public static List<String> inputNameModels(Scanner in, int amountModels) {

		List<String> listModels = new ArrayList<>();

		for (int i = 0; i < amountModels; i++) {
			System.out.println("Qual nome do " + i + "º model? (Primeira letra em Maiúsculo)");
			listModels.add(in.next());
		}

		return listModels;
	}

	public static int inputAmountModels(Scanner in) {
		System.out.println("Quantos models deseja criar?");
		int amountModels = in.nextInt();
		return amountModels;
	}

	public static String inputPathProject(Scanner in) {
		System.out.println("Digite o caminho que deseja salvar:");
		String path = in.next();
		return path;
	}

	public static String inputNameProject(Scanner in) {
		System.out.println("Digite o nome do projeto:");
		String nameProject = in.next();
		return nameProject;
	}

}
