package main.utileria;

import java.io.*;
public class Archivos {

	public static void crearArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			salida.close();
			System.out.println("El archivo se ha creado correctamente");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void escribirArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			String contenido = "Esto se agregaria al archivo";
			salida.println(contenido);
			salida.println();
			salida.println("Fin del contenido");
			salida.close();
			System.out.println("Se ha escrito en el archivo con exitu");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void leerArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		
		try{
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String lectura = entrada.readLine();
			
			while(lectura != null) {
				System.out.println("Lectura:: "+lectura);
				lectura = entrada.readLine();
			}
			entrada.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void anexarArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			String contenido = "Anexando informacion al archivo";
			salida.println(contenido);
			salida.println();
			salida.println("Fin de anexado");
			salida.close();
			System.out.println("Se ha anexado informacion correctamente");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
