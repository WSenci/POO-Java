package semana02;

import javax.swing.JOptionPane;

public class Entrada3 {
	
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Nota1?");
		if(s!=null && !s.equals("")) {
			//usuário pressionou OK
			float n1 = Float.parseFloat(s);
			s = JOptionPane.showInputDialog("Nota2?");
			if(s!=null  && !s.equals("")) {
				float n2 = Float.parseFloat(s);
				JOptionPane.showMessageDialog(null, "A média é: "+(n1+n2)/2);
			}
		}
	}

}
