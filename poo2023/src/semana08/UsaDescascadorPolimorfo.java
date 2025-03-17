package semana08;

import javax.swing.JOptionPane;

public class UsaDescascadorPolimorfo {

	public static void main(String[] args) {
		
		String op = JOptionPane.showInputDialog(
				"Qual fruta deseja descascar?\n1 - Banana\n2 - Nanica\n3 - Prata\n4 - Abacaxi\n5 - Laranja\n6 - Limão");
		Fruta f = null;
		switch(op) {
		case "1": f = new Banana();break;
		case "2": f = new Nanica();break;
		case "3": f = new Prata();break;
		case "4": f = new Abacaxi();break;
		case "5": f = new Laranja();break;
		case "6": f = new Limao();break;
		}
		DescascadorPolimorfo.run(f);
	}

}
