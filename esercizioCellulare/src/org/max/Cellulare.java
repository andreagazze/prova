package org.max;

public class Cellulare {
	
	// quantitativo di euro disponibile per le chiamate.
	 private double carica = 0;
	 
	 //numero di chiamate effettuate con il cellulare
	 private int numeroChiamate = 0;


	public Cellulare(double unaCarica) {
		 this.carica = unaCarica;
	 }
	 
	 public void ricarica(double unaRicarica) {
		 carica += unaRicarica;
	 }
	 
	 public void chiama(double minutiDurata) {
		 this.carica = carica - (minutiDurata * 0.20);
		 this.numeroChiamate += 1;
	 }
	 
	 public double numero404() {
		 return carica;
	 }
	 
	 public int getNumeroChiamate() {
		 return numeroChiamate;
	 }
	 
	 public void azzeraChiamate() {
		 this.numeroChiamate = 0;
	 }

	@Override
	public String toString() {
		return "Cellulare [carica=" + carica + ", numeroChiamate=" + numeroChiamate + "]";
	}
	 
	 
}
