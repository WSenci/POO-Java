package semana02;

public class Math02 {
	
	public static void main(String[] args) {
		final int LIMITE = 100;
		//double n = Math.random();
		for(int c=1; c<=10; c++) {
			System.out.print("Cartão "+c+": ");
			for(int i = 1; i<=6; i++) {
				System.out.print((int)(Math.random()*LIMITE)+" ");
			}
			System.out.println();
		}
		
		double g = Math.random();
		
		System.out.println(g);
		System.out.println(g*100);
		System.out.println(g*60);
		
	}

}
