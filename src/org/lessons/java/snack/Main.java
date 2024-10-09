package org.lessons.java.snack;

public class Main {

	public static void main(String[] args) {
		
		/* SNACK 1 
		 * Scrivi una classe Studente con i seguenti attributi: nome, cognome, età. 
		 * Implementa un costruttore che accetta tre parametri per inizializzare questi attributi. 
		 * Aggiungi un metodo che restituisca una stringa concatenata dei valori.
		 * */
		
		/* Snack1 nuovoStudente = new Snack1("Andrea","Offredi",27);
		System.out.println("Dati del nuovo Studente:" + " " + nuovoStudente.getNomeEsteso());
		*/
	
	
		/* SNACK 2
		 * Crea una classe ContoBancario con attributi per numero di conto e saldo. 
		 * Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. 
		 * Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.
		 * */
	
		/*
		ContoBancario mioConto = new ContoBancario(23456789);
	
		System.out.println("Il tuo numero conto è: " + mioConto.getnumeroConto()); //stampa numero conto attuale
		System.out.println("Il tuo saldo iniziale: " + mioConto.getsaldoConto()); //stampa saldo attuale
	
		//DEPOSITO
		mioConto.setDeposito(100);
		System.out.println("Il saldo dopo deposito è: " + mioConto.getsaldoConto());
	
		//PRELIEVO
		mioConto.setPrelievo(40);
		System.out.println("Il saldo dopo prelievo è: " + mioConto.getsaldoConto());
	
		//PRELIEVO NEGATIVO
		mioConto.setPrelievo(90);
		System.out.println("Il saldo dopo prelievo è: " + mioConto.getsaldoConto());
		*/
		
		
	
		/* SNACK 3
		 * Crea una classe RegistroStudenti che rappresenti un registro di studenti. 
		 * Utilizza un array privato per memorizzare oggetti Studente. 
		 * Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro. 
		 * Aggiungi un metodo che stampi la lista degli studenti
		 * */
		
		RegistroStudenti nuovoRegistro = new RegistroStudenti();
		
		//Aggiungiamo gli studenti
		Studente s1 = new Studente("Andrea");
		Studente s2 = new Studente("Luca");
		Studente s3 = new Studente("Marco");
		Studente s4 = new Studente("Giulia");
		Studente s5 = new Studente("Chiara");
		Studente s6 = new Studente("Sonia");
		Studente s7 = new Studente("Alberto");
		Studente s8 = new Studente("Fabio");
		Studente s9 = new Studente("Elena");
		Studente s10 = new Studente("Alice");
	
		//Aggiungiamo i nuovi studenti all'array
		nuovoRegistro.aggiungiStudente(s1);
		nuovoRegistro.aggiungiStudente(s2);
		nuovoRegistro.aggiungiStudente(s3);
		nuovoRegistro.aggiungiStudente(s4);
		nuovoRegistro.aggiungiStudente(s5);
		nuovoRegistro.aggiungiStudente(s6);
		nuovoRegistro.aggiungiStudente(s7);
		nuovoRegistro.aggiungiStudente(s8);
		nuovoRegistro.aggiungiStudente(s9);
		nuovoRegistro.aggiungiStudente(s10);
		
		//Stampiamo la lista studenti
		nuovoRegistro.stampaRegistro();
	
	
	
	}
}
