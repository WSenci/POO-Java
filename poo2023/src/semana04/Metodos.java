package semana04;

public class Metodos {
	/**
	 * Jeito correto de comentar
	 * todos os metodos precisam ser comentados
	 * Recebe dois valores e retorna a soma entre eles
	 * @param a - primeiro valor
	 * @param b - segundo valor
	 */
	public static void somar(float a, float b) {
		System.out.println(a+b);
	}
	
	/**
	 * Soma dois valores.
	 * @param a - o primeiro valor.
	 * @param b - o segundo valor.
	 */
	public static void somar(int a, int b) {
		System.out.println(a+b);
	}
	
	/**
	 * Soma dois valores.
	 * @param a - o primeiro valor.
	 * @param b - o segundo valor.
	 */
	public static void somar(int a, float b) {
		
		System.out.println(a+b);//A resposta prioriza o float.
	}
	
	/**
	 * soma três valores.
	 * @param a - o primeiro valor.
	 * @param b - o segundo valor.
	 * @param c - o terceiro valor.
	 */
	public static void somar(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	

	
	/**
	 * Subtrai dois valores.
	 * @param a - o primeiro valor.
	 * @param b - o segundo valor.
	 */
	public static void subtrair(int a, int b) {
		System.out.println(a-b);
	}

	/**
	 * Multiplica dois valores.
	 * @param a - o primeiro valor.
	 * @param b - o segundo valor.
	 */
	public static void multiplicar(int a, int b) {
		System.out.println(a*b);
	}
	
	/**
	 * Divide dois valores.
	 * @param a - o primeiro valor.
	 * @param b - o segundo valor.
	 */
	public static void dividir(int a, int b) {
		System.out.println(a/b);
	}

}
