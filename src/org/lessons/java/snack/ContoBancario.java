package org.lessons.java.snack;

public class ContoBancario {

	private int numeroConto;
	private double saldoConto;
	
	
	//COSTRUTTORE
	public ContoBancario(int numeroConto) {
		this.numeroConto = numeroConto;
		saldoConto = 0;
	}
	
	//METODO PER INSERIRE IL DEPOSITO E CALCOLARE IL NUOVO SALDO
	public void setDeposito(double depositoConto) {
		if(depositoConto <= 0) {
			System.out.println("Inserisci una cifra valida!");
		}else {
			double nuovoSaldo = depositoConto + saldoConto;
			saldoConto = nuovoSaldo;
		}
	}
	
	//METODO PER INSERIRE IL PRELIEVO E CALCOLARE IL NUOVO SALDO
	public void setPrelievo(double prelievoConto) {
		if(prelievoConto <= 0 || prelievoConto > saldoConto) {
			System.out.println("Importo NON prelevabile!");
		}else {
			double nuovoSaldo = saldoConto - prelievoConto;
			saldoConto = nuovoSaldo;
		}
	}
	
	//METODO PER RESTITUIRE SOLO IL VALORE DEL SALDO
	public double getsaldoConto() {
		return saldoConto;
	}
	
	//METODO PER RESTITUIRE SOLO IL NUMERO DEL CONTO
	public int getnumeroConto() {
		return numeroConto;
	}
}
