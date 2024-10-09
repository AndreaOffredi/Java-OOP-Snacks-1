package org.lessons.java.snack;

public class Studente {

	private String nomeStudente;
	
	
	//COSTRUTTORE: Assegnare un valore al nome
	public Studente(String nomeStudente) {
		this.nomeStudente = nomeStudente;
	}
	
	// METODO PER STAMPARE L'OGGETTO COME STRINGA
    @Override
    public String toString() {
        return "Nome Studente: " + nomeStudente;
    }
}
