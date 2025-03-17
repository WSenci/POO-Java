package atividade_semana08;

import javax.swing.JOptionPane;

public class Circulo extends FormaGeometrica {

	@Override
	public void calcularArea() {
		float r = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio do círculo: "));
		JOptionPane.showMessageDialog(null, "A área do triângulo é: "+(r*r)*3.14);
	}
}
