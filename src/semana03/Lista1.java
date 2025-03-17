package semana03;

import javax.swing.JOptionPane;

public class Lista1 {
	
	public static void main(String[] args) {
		//Converter metros em centímetros.
		
		try {
			float metros = Float.parseFloat(JOptionPane.showInputDialog("Metros?"));
			float centimetros = metros*100;
			JOptionPane.showMessageDialog(null, "Centímetros: " + centimetros);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Deu pau: " + e);
		}
	}

}
