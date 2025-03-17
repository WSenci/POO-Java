package atividade_semana08;

import javax.swing.JOptionPane;

public class Quadrado extends FormaGeometrica {

	@Override
	public void calcularArea() {
		float l = Float.parseFloat(JOptionPane.showInputDialog("Digite a área: "));
		float area = l*l;
		JOptionPane.showMessageDialog(null, "A área do quadrado é: "+area);
		
	}
}
