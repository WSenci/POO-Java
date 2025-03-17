package semana02;

import javax.swing.JOptionPane;

public class Entrada2 {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Entre com a largura");
		int largura = Integer.parseInt(s);
		int comprimento = Integer.parseInt(
				JOptionPane.showInputDialog("Entre com o comprimento"));
		double area = largura * comprimento;
		JOptionPane.showMessageDialog(null, "Area: "+area);
	}
	
}
