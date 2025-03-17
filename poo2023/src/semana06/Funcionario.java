package semana06;

import javax.swing.JOptionPane;

public class Funcionario extends PessoaFisica {
	
	private String cargo;
	private double salario;
	
	public void digitar() {
		super.digitar();
		cargo = JOptionPane.showInputDialog("Cargo?");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Salario?"));
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("Cargo: "+cargo);
		System.out.println("Salario: "+salario);
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
