package fin.coop1504.tallerjava;

import fin.coop1504.tallerjava.servicios.Ciclista;

public class AplicacionTaller {
	public static void main(String[] args) {

		Thread hilo1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("Soy el hilo 1");
				}
			}
		});

		Thread hilo2 = new Thread(new Runnable() {

			public void run() {

				System.out.println("Soy el hilo 2");

			}
		});

		hilo1.start();
		hilo2.start();
		System.out.println("Hilo principal");

		// otra forma hilos con herencia de clase threads en la clase Ciclista
//		Ciclista ciclista1 = new Ciclista("Karen", "001");
//		Ciclista ciclista2 = new Ciclista("Byron", "002");
//		Ciclista ciclista3 = new Ciclista("Ramiro", "003");
//		Ciclista ciclista4 = new Ciclista("Javier", "004");
//		
//		
//		System.out.println("Hilo 1");
//		ciclista1.start();//start es de thread
//		
//		System.out.println("Hilo 2");
//		ciclista2.start();
//		
//		System.out.println("Hilo 3");
//		ciclista3.start();
//		
//		System.out.println("Hilo 4");
//		ciclista4.start();
//		
//		System.out.println("Hilo principal");
	}

}
