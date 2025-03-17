package semana02;

public class For01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Com letras
		for(char c = 'A'; c<='z'; c++) {
			System.out.println(c + "-" + (int)c);
			Thread.sleep(1000);
		}
		
		//Com números
		for(int a = 1; a<=10; a++) {
			System.out.println(a);
			Thread.sleep(1000);
		}
		
		for(int a = 10; a>0; a--) {
			System.out.println(a);
			Thread.sleep(1000);
		}
	}

}
