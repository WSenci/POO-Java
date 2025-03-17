package semana04;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		double nota = 0;

		do {
			nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
		} while (!Metodos02.validar(nota));
		System.out.println(nota);

//		double n = Metodos02.lerNota("Digite a nota da prova");
//		System.out.println(n);

//		String r = Metodos02.gerarSenha(50);
//		System.out.println(r);
//		
//		System.out.println(Metodos02.gerarSenha(50));
	}

}
