package semana06;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa {
	// PessoaFisica tem tudo qeu tem em Pessoa

	private String cpf;

	public void digitar() {
		nome = JOptionPane.showInputDialog("Nome?");
		super.digitar();
		cpf = JOptionPane.showInputDialog("CPF?");
	}

	public void mostrar() {
		super.mostrar();
		System.out.println("CPF: " + cpf);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
