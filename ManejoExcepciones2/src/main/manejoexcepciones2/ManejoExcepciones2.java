package main.manejoexcepciones2;

import main.datos.AccesoDatos;
import main.datos.ImplementacionMysql;
import main.excepciones.AccesoDatosEx;
import main.excepciones.LecturaDatosEx;

public class ManejoExcepciones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccesoDatos datos = new ImplementacionMysql();
		datos.setSimularError(true);
	
		ejecutar(datos, "listar");
		
		datos.setSimularError(true);
		System.out.println("");
		ejecutar(datos, "insertar");
	}

	private static void ejecutar(AccesoDatos datos, String accion) {
		// TODO Auto-generated method stub
		if("listar".equals(accion))
			try {
				datos.listar();
			}catch(LecturaDatosEx ex) {
				System.out.println("Error lectura: procesa la excepcion mas especifica sobre lectura");
			}catch(AccesoDatosEx ex) {
				System.out.println("Error acceso datos: procesa la excepcion mas generica de acceso datos");
			}catch(Exception ex) {
				System.out.println("Error general");
			}finally {
				System.out.println("Procesar finnaly es opcional, este bloque se ejecutara, alla error o no");
			}
		else if("insertar".equals(accion)) {
			try {
				datos.insertar();
			}catch(AccesoDatosEx ex) {
				System.out.println("Error acceso datos: procesa la excepcion mas generica de acceso datos");
			}finally {
				System.out.println("Procesar finnaly es opcional, este bloque se ejecutara, alla error o no");
			}
		}else {
			System.out.println("No se proporciono ninguna accion conocida");
		}
	}
	
	

}
