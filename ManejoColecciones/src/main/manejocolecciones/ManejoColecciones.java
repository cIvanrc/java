package main.manejocolecciones;

import java.util.*;

public class ManejoColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List miLista = new ArrayList();
		miLista.add("1");
		miLista.add("2");
		miLista.add("3");
		miLista.add("4");
		
		imprimir(miLista);
		
		Set miSet = new HashSet();
		miSet.add("100");
		miSet.add("200");
		miSet.add("300");
		miSet.add("300");
		
		imprimir(miSet);
		
		
		Map miMapa = new HashMap();
		miMapa.put("1", "Testo1");
		miMapa.put("2", "Testo2");
		miMapa.put("3", "Testo3");
		miMapa.put("4", "Testo4");
		miMapa.put("4", "Testo5");
		
		imprimir(miMapa.keySet());
		
		imprimir(miMapa.values());
		
	}

	private static void imprimir(Collection coleccion) {
		// TODO Auto-generated method stub
		for(Object elemento: coleccion) {
			System.out.print(elemento+"::");
		}
		System.out.println("");
	}

}
