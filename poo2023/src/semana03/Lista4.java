package semana03;

import javax.swing.JOptionPane;

public class Lista4 {
	
	public static void main(String[] args) {
		//Elabore uma aplicação que peça uma nota, entre zero e dez. Mostre uma 
		//mensagem caso o valor seja inválido e continue pedindo até que o usuário 
		//informe um valor válido.
		try {
			int nota = -1;
			do{
				nota = Integer.parseInt(JOptionPane.showInputDialog("Digite uma nota de 0 a 10:"));
			}
			while(nota<0 || nota>10);
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite uma idade válida!");
			
		}
	}
}
