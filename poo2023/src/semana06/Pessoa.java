package semana06;

import javax.swing.JOptionPane;

public abstract class Pessoa {
	private int codigo;
	protected String nome;
	
	public void digitar() {
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Código?"));
		nome = JOptionPane.showInputDialog("Nome?");
	}
	
	public void mostrar() {
		System.out.println("Código: "+codigo);
		System.out.println("nome: "+nome);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
