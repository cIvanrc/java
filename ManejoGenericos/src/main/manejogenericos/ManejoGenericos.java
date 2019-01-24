package main.manejogenericos;

public class ManejoGenericos {

	public static void main(String[] args) {
		
		ClaseGenerica<Integer> genericaInt = new ClaseGenerica<>(15);
		genericaInt.obtenerTipo();	
		
		
		ClaseGenerica<String> genericaStr = new ClaseGenerica<>("Testu");
		genericaStr.obtenerTipo();
	}
}
