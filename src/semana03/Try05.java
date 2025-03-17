package semana03;

import java.io.FileNotFoundException;

public class Try05 {
	
	public static void main(String[] args) {
		//Exemplo de checked exception
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		}
		catch(FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
		
	}

}
