package semana02;

import javax.swing.JOptionPane;

public class String01 {
	
	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("Seu nome?");
		
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		
	}

}
