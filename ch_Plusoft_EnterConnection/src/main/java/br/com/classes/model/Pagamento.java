package br.com.classes.model;

public class Pagamento {

	private int cod_pag;
	private String id_clien;
	private String mtd_pag;
	private int valor_pag;
	private String stat_pag;
	public int getCod_pag() {
		return cod_pag;
	}
	public void setCod_pag(int cod_pag) {
		this.cod_pag = cod_pag;
	}
	public String getId_clien() {
		return id_clien;
	}
	public void setId_clien(String id_clien) {
		this.id_clien = id_clien;
	}
	public String getMtd_pag() {
		return mtd_pag;
	}
	public void setMtd_pag(String mtd_pag) {
		this.mtd_pag = mtd_pag;
	}
	public int getValor_pag() {
		return valor_pag;
	}
	public void setValor_pag(int valor_pag) {
		this.valor_pag = valor_pag;
	}
	public String getStat_pag() {
		return stat_pag;
	}
	public void setStat_pag(String stat_pag) {
		this.stat_pag = stat_pag;
	}
}
