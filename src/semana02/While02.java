package semana02;

import javax.swing.JOptionPane;

public class While02 {
	
	public static void main(String[] args) {
		
		//Elabore uma aplicação que solicite a digitação de um valor entre 0 e 10.
		
		float nota1, nota2;
		while(true) { //laço infinito
			//para sair do laço a nota deve ser válida
			nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1?"));
			if(nota1>=0 && nota1<=10) break;
		}
		while(true) { //laço infinito
			//para sair do laço a nota deve ser válida
			nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2?"));
			if(nota2>=0 && nota2<=10) break;
		}
		JOptionPane.showMessageDialog(null, (nota1+nota2)/2);
	}

}
