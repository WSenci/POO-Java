package semana03;

public class Array01 {
	
	public static void main(String[] args) {
		
		String[] nomes = {"Ana", "Bia"};
		String[] produtos = new String[2];
		produtos[0] = "Sabão";
		produtos[1] = "Sabonete";
		
		String n = "Paulo;Sandro;Bianca;Paula";
		String[] v = n.split(";");
		
		for(int i=0; i<v.length; i++) {
			System.out.println(v[i]);
		}
		
		//iterator
		for(String s:v) {
			System.out.println(s);
		}
		
	}

}
