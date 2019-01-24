package main.manejocoleccionesgenericas;

import java.util.*;
public class ManejoColeccionesGenericas {

	public static void main(String[] args) {
		
		List<String> miLista = new ArrayList<>();
			miLista.add("1");
			miLista.add("2");
			miLista.add("3");
			miLista.add("4");
			miLista.add("5");
		imprimir(miLista);
		
		Set<String> miSet = new HashSet<>();
			miSet.add("100");
			miSet.add("200");
			miSet.add("300");
			miSet.add("300");
		imprimir(miSet);
		
		Map<String, String> miMapa = new HashMap<>();
			miMapa.put("1", "test1");
			miMapa.put("2", "test2");
			miMapa.put("3", "test3");
			miMapa.put("4", "test4");
		imprimir(miMapa.keySet());
		imprimir(miMapa.values());
	}

	static void imprimir(Collection<String> col) {
		// TODO Auto-generated method stub
		for (String elemento : col)
			System.out.print("::"+elemento);
		
		System.out.println("");
	}
}
