package atividade02;

import javax.swing.JOptionPane;
import java.util.List;

public class Exercicio {
	
	public void letrasSeparadas() {
		String palavra = JOptionPane.showInputDialog("Digite a palavra: ");
		int tamanho = palavra.length();
		char letra;
		for(int i = 0;i<tamanho;i++) {
			letra = palavra.charAt(i);
			System.out.println(letra);
		}
		
	}
	public void tabuada() {
		int num;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 10"));
			if(num>10 || num<1) {
				JOptionPane.showMessageDialog(null, "Número inválido.");
			}
		}while(num>10 || num<1);
		for(int i = 1; i<=10; i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
	public void numRandom() {
		final int LIM = 100;
		for(int i = 1; i<=5; i++) {
			int num = (int)(Math.random()*LIM+1);
			System.out.println(num);
		}
	}
	public void diaSemana() {
		int dia;
		do {
			dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7:"));
			if(dia>7 || dia<1) {
				JOptionPane.showMessageDialog(null, "Inexistente.");
			}
		}while(dia>7 || dia<1);
		switch(dia){
		case 1:
			System.out.println("Domingo.");
			break;
		case 2:
			System.out.println("Segunda.");
			break;
		case 3:
			System.out.println("Terça.");
			break;
		case 4:
			System.out.println("Quarta.");
			break;
		case 5:
			System.out.println("Quinta.");
			break;
		case 6:
			System.out.println("Sexta.");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		}
	}
	public void listaNomes() {
		List<String> nomes = List.of("Ana", "Bruno", "Carla", "Diego", "Eduarda");
		System.out.println("Nomes na lista:");
		for(String nome : nomes) {
			System.out.println(nome);
			
		}
		
	}
	
	//COM RETORNO
	
	public int numPar() {
		int contador = 0;
		List<Integer> numeros = List.of(23, 54, 55, 40, 52, 4, 235, 58, 85, 28, 29, 38, 9, 81);
		System.out.println("Números pares:");
		for(Integer numero : numeros) {
			if(numero%2 == 0) {
				System.out.println(numero);
				contador++;
			}
		}
		System.out.println("Total: "+contador);
		
		return contador;
	}
	
	public int soma10(int[] num) {
		int soma=0;
		for(int i=0; i<10; i++) {
			soma += num[i];
		}
		return soma;
	}
	
	public float mediaArit(float[] notas) {
		float media = 0;
		int i=0;
		for(i=0; i<notas.length; i++) {
			media += notas[i];
		}
		return media/i;
	}
	
	public int[] valoresRandom(int n1, int n2) {
		int[] vetor = new int[n1];
		for(int i=0; i<n1; i++) {
			vetor[i] = (int)(Math.random() * (n2 + 1));
		}
		return vetor;
	}
	
	public boolean confirmaCPF(String cpf) {
		String[] chck1 = cpf.split("\\.");
		
		if(chck1.length != 3) return false;
		
		String[] chck2 = chck1[2].split("/");
		
		if(chck2.length !=2) return false;

		if(chck1[0].length() == 3 && chck1[1].length() == 3 && chck2[0].length() == 3 && chck2[1].length() == 2) {
			try { 
				Integer.parseInt(chck1[0]);
				Integer.parseInt(chck1[1]);
				Integer.parseInt(chck2[0]);
				Integer.parseInt(chck2[1]);
				}
			catch(Exception e) {return false;}
		}
		else return false;
		return true;
	}

}
