package fin.coop1504.tallerjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AplicacionArchivo {

	public static void main(String[] args) throws IOException {
		//File para leer el archivo
		File archivo = new File("C:/javaWeb/TALLER_COOP1504/cursoJAVACoop1504/documentoParaFileJava.txt");

		System.out.println("Se puede leer: " + archivo.canRead());
		System.out.println("Se puede escribir: " + archivo.canWrite());
		System.out.println("Existe: " + archivo.exists());// no lee datos, lee la meta data
		System.out.println("Path es directorio: " + archivo.isDirectory());
		System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
		System.out.println("Nombre archivo: " + archivo.getName());
		System.out.println("Tamaño archivo: " + archivo.getTotalSpace());

		// leer el archivo recorrido
		BufferedReader recorreArchivo = null;
		try {
			
			FileReader lector = new FileReader(archivo);// abre el archivo para ver contenido
			recorreArchivo = new BufferedReader(lector);
			String linea = recorreArchivo.readLine();
			
			while (linea != null) {
				
				System.out.println("Linea  del archivo: " + linea);
				linea = recorreArchivo.readLine();				
			}			
			
			

		} catch (FileNotFoundException e) {
			System.err.println("Error al abrir archivo");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Error al recorrer archivo");
			e.printStackTrace();
		}finally {
			//cerrar los recursos
			recorreArchivo.close();
		}

	}

}
