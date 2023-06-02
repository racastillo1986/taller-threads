package fin.coop1504.tallerjava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class AplicacionEscrituraArchivo {

	public static void main(String[] args) {
		PrintWriter formateador = null;
		try {
			//con esta forma la manejamos nosotros y si hay q cerrar al final el objeto
			FileWriter archivo = new FileWriter("C:/javaWeb/TALLER_COOP1504/cursoJAVACoop1504/salida2.txt", true);
			// string a byte -> BufferedWriter
			BufferedWriter escritor = new BufferedWriter(archivo);
			// escribir en el archivo con metodo println
			formateador = new PrintWriter(escritor);
			formateador.println("Salida");
			formateador.println("Archivo");
			
			
			//PrintStream es de la clase System esta es otra forma de escribir en el archivo 
			//Estos dos objetos(salida3.txt y error.txt) los gestiona System y no hay q cerrarlo
			FileOutputStream salidaArchivo = new FileOutputStream("C:/javaWeb/TALLER_COOP1504/cursoJAVACoop1504/salida3.txt",true);
			PrintStream salida = new PrintStream(salidaArchivo);
			System.setOut(salida);
			System.out.println("Escritura por consola");
			System.out.println("Escritura 2");
			
			
			FileOutputStream salidaError = new FileOutputStream("C:/javaWeb/TALLER_COOP1504/cursoJAVACoop1504/error.txt",true);
			PrintStream archivoError = new PrintStream(salidaError);
			System.setErr(archivoError);
			System.err.println("esto es un error");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (formateador != null)
				formateador.close();
		}
	}

}
