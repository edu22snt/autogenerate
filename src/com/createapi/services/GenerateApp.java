package com.createapi.services;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GenerateApp {

	public static void generate() {

		JFrame frame = generateFrame();

		generateLogo(frame);

		JTextField projectName = generateInputProjectName(frame);

		JTextField pathProject = generateInputPathProject(frame);

		JTextField modelName = generateInputModel(frame);

		Set<String> models = new HashSet<String>();

		JTable tableModels = generateTableModels(frame);

		generateButtonPlusModel(frame, modelName, models, tableModels);

		generateButtonToGenerate(frame, projectName, pathProject, models);

	}

	private static JFrame generateFrame() {
		JFrame frame = new JFrame("AutoGenerator");
		frame.setVisible(true);
		frame.setSize(500, 600);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		return frame;
	}

	private static void generateLogo(JFrame frame) {

		JLabel autoGenerate = new JLabel("AutoGenerate");
		frame.add(autoGenerate);
		autoGenerate.setFont(new Font("Arual", 50, 50));
		autoGenerate.setBounds(90, 30, 500, 100);
	}

	private static JTextField generateInputProjectName(JFrame frame) {

		JLabel nameProjectLabel = new JLabel("Nome do Projeto (Utilize o formato CamelCase)");
		frame.add(nameProjectLabel);
		nameProjectLabel.setBounds(50, 140, 390, 25);

		JTextField nameProject = new JTextField();
		frame.add(nameProject);
		nameProject.setBounds(50, 160, 390, 25);

		return nameProject;
	}

	private static JTextField generateInputPathProject(JFrame frame) {

		JTextField pathProjectText = new JTextField();
		frame.add(pathProjectText);
		pathProjectText.setText("Clique no botão para selecionar o diretório");
		pathProjectText.setBounds(185, 200, 255, 25);
		pathProjectText.setEditable(false);

		JButton pathProjectButton = new JButton("Gerar em");
		frame.add(pathProjectButton);
		pathProjectButton.setBounds(50, 200, 130, 25);

		pathProjectButton.addActionListener(new ActionListener() {
			String pathProject = null;

			@Override
			public void actionPerformed(ActionEvent arg0) {

				pathProject = getPathProject();
				pathProjectText.setText(pathProject);
			}
		});

		return pathProjectText;
	}

	private static String getPathProject() {

		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new java.io.File("."));
		chooser.setDialogTitle("Selecione o diretorio do seu projeto");
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setAcceptAllFileFilterUsed(false);

		if (chooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
			return "Necessário selecionar o caminho do projeto!";
		}

		return chooser.getSelectedFile().getAbsolutePath().toString();
	}

	private static JTextField generateInputModel(JFrame frame) {

		JLabel modelLabel = new JLabel("Insira as Entidades (Utilize o formato CamelCase)");
		frame.add(modelLabel);
		modelLabel.setBounds(50, 240, 390, 25);

		JTextField model = new JTextField();
		frame.add(model);
		model.setBounds(50, 260, 335, 25);

		return model;
	}

	private static void generateButtonPlusModel(JFrame frame, JTextField modelName, Set<String> models,
			JTable tableModels) {

		JButton plusModel = new JButton("+");
		frame.add(plusModel);
		plusModel.setBounds(390, 260, 50, 25);
		plusModel.setFont(new Font("Arial", 20, 20));
		plusModel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				models.add(modelName.getText());

				DefaultTableModel modelModels = (DefaultTableModel) tableModels.getModel();
				modelModels.addRow(new Object[] { modelName.getText() });

				modelName.setText("");

			}
		});
	}

	@SuppressWarnings("serial")
	private static JTable generateTableModels(JFrame frame) {

		JTable tableModels = new JTable();
		JScrollPane scrollTableModels = new JScrollPane();
		JPanel panelModels = new JPanel();

		int x = 390;
		int y = 140;

		tableModels.setLayout(null);
		tableModels.revalidate();
		tableModels.setBounds(0, 0, x, y);
		tableModels.setModel(new DefaultTableModel(new Object[] { "Entidades" }, 0) {

			@Override
			public boolean isCellEditable(int row, int col) {
				return false;
			}

		});

		scrollTableModels.add(tableModels);
		scrollTableModels.setViewportView(tableModels);
		scrollTableModels.setBounds(0, 0, x, y);

		frame.add(panelModels);
		panelModels.add(scrollTableModels);
		panelModels.setLayout(null);
		panelModels.setBounds(50, 290, x, y);

		return tableModels;
	}

	private static void generateButtonToGenerate(JFrame frame, JTextField projectName, JTextField pathProject,
			Set<String> models) {

		JButton generate = new JButton("Gerar");
		frame.add(generate);
		generate.setFont(new Font("Arial", 20, 20));
		generate.setBounds(50, 450, 390, 50);

		generate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				GenerateProject.generate(projectName.getText(), pathProject.getText(), models);
				JOptionPane.showMessageDialog(null, "Projeto gerado com sucesso!");
			}
		});

	}

}
