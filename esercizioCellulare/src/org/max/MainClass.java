package org.max;

public class MainClass {
	
	public static void main(String[] args) {
		Cellulare c = new Cellulare(10);
		System.out.println(c);

		c.ricarica(10);
		System.out.println(c);

		c.chiama(5);
		System.out.println(c);

		c.getNumeroChiamate();
		System.out.println(c);
	}
	
}
