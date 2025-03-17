package semana04;

public class Recursividade {
	
	static int contador = 1;
	
	public static void contar(int limite) {
		if(contador<=limite) {
			System.out.println(contador++);
			contar(limite);
		}
	}
	
	public static int somatorioRecursivo(int limite) {
		if(contador<=limite) {
			contador+=contador++;
			somatorioRecursivo(limite);
		}
		return contador;
	}
	
	public static void somatorio(int limite) {
		int total = 0;
		for(int i=1; i<=limite; i++) {
			total+=i;
		}
		System.out.println(total);
	}
	
	public static void main(String[] args) {
//		contar(10);
//		somatorio(100);
		System.out.println(somatorioRecursivo(10));
	}

}
