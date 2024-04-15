package br.com.classes.model;

public class Funcionario extends Pessoa{

	private String cargo;
	private String id_func;
	private int salario;
	
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getId_func() {
		return id_func;
	}
	public void setId_func(String id_func) {
		this.id_func = id_func;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
}
