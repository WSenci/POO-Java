package atividade_semana08;

import javax.swing.JOptionPane;

public class Triangulo extends FormaGeometrica {
	
	@Override
	public void calcularArea() {
		float b = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do triângulo: "));
		float h = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
		float area = (b*h)/2;
		JOptionPane.showMessageDialog(null, "A área do triângulo é: "+area);
	}

}
