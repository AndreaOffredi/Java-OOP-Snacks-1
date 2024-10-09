package org.lessons.java.snack;

public class RegistroStudenti {

	private Studente[] studenti;
	private int numeroStudenti;
	
	
	//COSTRUTTORE: DIMENSIONI REGISTRO + NUMERO ATTUALE STUDENTI
	public RegistroStudenti() {
		studenti = new Studente[10]; //Può contenere massimo 10 studenti
		numeroStudenti = 0;
	}
	
	//METODO PER AGGIUNGERE STUDENTI	
	public void aggiungiStudente(Studente nomeStudente) {
		if (numeroStudenti < studenti.length) {
            studenti[numeroStudenti] = nomeStudente;
            numeroStudenti++;
        } else {
            System.out.println("Il registro è pieno, non è possibile aggiungere altri studenti.");
        }
	}
		    
	
	//METODO PER STAMPARE LA LISTA DEGLI STUDENTI
	public void stampaRegistro() {
		System.out.println("Elenco degli studenti nel registro:");
	     for (int i = 0; i < numeroStudenti; i++) {
	    	 System.out.println(studenti[i]);
	     }     
	}
}
