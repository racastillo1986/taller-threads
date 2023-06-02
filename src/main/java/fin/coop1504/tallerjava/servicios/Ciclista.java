package fin.coop1504.tallerjava.servicios;

import java.util.Iterator;

public class Ciclista extends Thread {
	
	private String numero;
	private String nombre;
	
	public Ciclista(String num, String nom) {
		numero = num;
		nombre = nom;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getNumero() {
		return numero;
	}
	
	
	@Override
	public void run() {		
		for (int i=0; i  < 1000; i++) {
			System.out.println("Ciclista: " + nombre + ", numero: " + numero);
		}
	}
	

}
