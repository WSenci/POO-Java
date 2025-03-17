package semana02;

import java.util.Scanner;

public class Entrada1 {
	
	public static void main(String[] args) {
		//Entrada de dados com o Scanner
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a largura");

		int largura = sc.nextInt();

		System.out.println("Entre com o comprimento");

		int comprimento = sc.nextInt();

		int area = largura * comprimento;

		System.out.println("Area: "+area);
	}

}
