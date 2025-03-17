package semana06;

public class UsaComputador {
	public static void main(String[] args) {
		//Pessoa p = new Pessoa();
		//p.nome = "juao";
		
		Computador c = new Computador();
		System.out.println(c.descricao);
		System.out.println(c.toString());
		System.out.println(c.hashCode());
		System.out.println(c.getClass());
	}

}
