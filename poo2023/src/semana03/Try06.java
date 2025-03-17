package semana03;

import javax.swing.JOptionPane;

public class Try06 {
	
	public static void main(String[] args) {
		//manter o programa no ar...
		while(true) {
			try {
				int idade = -1;
				do {
					idade = Integer.parseInt(JOptionPane.showInputDialog("Idade (0 e 20)"));
				}
				while(idade<0||idade>120);
				break;
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite uma idade válida!");
			}
		}
	}

}
