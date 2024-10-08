package org.lessons.java.snack;

public class Snack1 {

	private String nomeStudente;
	private String cognomeStudente;
	private int etaStudente;
	
	
	public Snack1(String nomeStudente,String cognomeStudente,int etaStudente){
		this.nomeStudente = nomeStudente;
		this.cognomeStudente = cognomeStudente;
		this.etaStudente = etaStudente;
	}
	
	public String getNomeEsteso() {
		return nomeStudente + "-" + cognomeStudente + "-" + etaStudente; //creo concatenazione
	}
}
