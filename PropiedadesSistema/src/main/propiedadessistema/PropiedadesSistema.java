package main.propiedadessistema;

import java.util.Enumeration;
import java.util.Properties;
public class PropiedadesSistema {

	public static void main(String[] args) {
		Properties propiedades = System.getProperties();
		Enumeration nombrePropiedades = propiedades.propertyNames();
		
		while(nombrePropiedades.hasMoreElements()) {
			String nombrePropiedad = (String) nombrePropiedades.nextElement();
			String valorPropiedad = propiedades.getProperty(nombrePropiedad);
			System.out.println("Nombre propiedad: "+nombrePropiedad+" / valor propiedad:" +valorPropiedad);
		}
		
	}
}
