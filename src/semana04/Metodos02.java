package semana04;

import javax.swing.JOptionPane;

public class Metodos02 {

	/**
	 * Solicita a entrada de uma nota de prova. A nota deve ser um valor entre 0 e
	 * 10.
	 * 
	 * @param men - uma mensagem aparece ao usuário
	 * @return - o valor da nota digitada Caso a nota digitada seja inválida, será
	 *         retornado o valor -1.
	 */
	public static double lerNota(String men) {
		double nota = 0;
		while (true) {
			try {
				nota = Double.parseDouble(JOptionPane.showInputDialog(men));
				if (nota < 0 || nota > 10)
					nota = -1;
				break;
			} catch (NumberFormatException erro) {

			}
		}
		return nota;
	}
	
	/**
	 * Realizar a validação de uma nota de prova.
	 * A nota deve ser um valor entre 0 e 10.
	 * @param nota - a nota a ser validada.
	 * @return - true caso a nota seja válida ou false caso contrário.
	 */
	public static boolean validar(double nota) {
		if(nota>=0 && nota<=10)
			return true;
		else
			return false;
	}

	/**
	 * Gera uma senha aleatória contendo n digitos.
	 * 
	 * @param qtdeDigitos - a quantidade de dígitos da senha.
	 * @return - a senha.
	 */
	public static String gerarSenha(int qtdeDigitos) {
		String s = "1234567890!@#$%&*abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String senha = "";

		for (int i = 0; i < qtdeDigitos; i++) {
			int n = (int) (Math.random() * s.length());
			senha += s.charAt(n);
		}
		return senha;

	}

	/**
	 * Recebe dois valores inteiros e retorna a soma entre eles
	 * 
	 * @param a - o primeiro valor.
	 * @param b - o segundo valor.
	 * @return - o resultado da soma.
	 */
	public static int somar(int a, int b) {
		// o retorno do método deve ser compatível com seu tipo.
		return a + b;
	}

}