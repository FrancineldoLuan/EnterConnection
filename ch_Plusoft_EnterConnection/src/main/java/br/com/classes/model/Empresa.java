package br.com.classes.model;

public class Empresa {

	private String cnpj;
	private String logradouro;
	private String parceiros_chav;
	private String nicho_empr;
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getParceiros_chav() {
		return parceiros_chav;
	}
	public void setParceiros_chav(String parceiros_chav) {
		this.parceiros_chav = parceiros_chav;
	}
	public String getNicho_empr() {
		return nicho_empr;
	}
	public void setNicho_empr(String nicho_empr) {
		this.nicho_empr = nicho_empr;
	}

}
