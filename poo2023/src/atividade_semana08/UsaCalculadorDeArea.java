package atividade_semana08;

import javax.swing.JOptionPane;

public class UsaCalculadorDeArea {
	public static void main(String[] args) {
		String op = JOptionPane.showInputDialog("Qual forma irá calcular?\n1 - Quadrado\n2 - Triângulo\n3 - Círculo");
		FormaGeometrica fg = null;
		switch(op) {
		case "1": fg = new Quadrado();break;
		case "2": fg = new Triangulo();break;
		case "3": fg = new Circulo();break;
		}
		CalculadorDeArea.calc(fg);
	}
}
