package semana03;

import java.util.Arrays;

public class Array02 {
	
	public static void main(String[] args) {
		String[] alunos = {"Jenifer", "Abner", "Sara", "Flávio"};
		
		System.out.println(alunos);
		System.out.println(Arrays.toString(alunos));
		
		String[] vetor = alunos;
		vetor[0] = "Guilherme";
		System.out.println(Arrays.toString(vetor));
		System.out.println(Arrays.toString(alunos));
	}

}
