package atividade02;

import javax.swing.JOptionPane;

public class ExerciciosTest {
	public static void main(String[] args) {
		Exercicio e = new Exercicio();
		
		//A
		e.letrasSeparadas();
		
		//B
		e.tabuada();
		
		//C
		e.numRandom();
		
		//D
		e.diaSemana();
		
		//E
		e.listaNomes();
		
		//F
		e.numPar();
		
		//G
		int[] num = {0,0,0,0,0,0,0,0,0,0};
		for(int i=0; i<10; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
		}
		System.out.println(e.soma10(num));
		
		//H
		float[] notas = {5, 10, 7, 4};
		System.out.print("Média: ");
		System.out.println(e.mediaArit(notas));
		
		//I
		int v1 = 3;
		int v2 = 10;
		int[] resp = e.valoresRandom(v1, v2);
		for(int i=0; i<v1; i++) {
			System.out.println(resp[i]);
		}
		
		//J
		String cpf = "478.932.235/48";
		if(e.confirmaCPF(cpf)) System.out.println("CPF válido.");
		else System.out.println("CPF inválido.");
	}

}
