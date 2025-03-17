package semana03;

import javax.swing.JOptionPane;

public class Try01 {
	
	public static void main(String[] args) {
		
		try {
			float nota = Float.parseFloat(JOptionPane.showInputDialog("Nota?"));
			JOptionPane.showMessageDialog(null, "Deu certo! Nota: " + nota);
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Deu pau: " + e);
		}
		finally { //Fechar uma conexão BD
			JOptionPane.showMessageDialog(null, "Encerrou ");
		}
		
	}

}
