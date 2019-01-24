package main.manejogenericos;

public class ClaseGenerica<T> {

	T objecto;

	public ClaseGenerica(T objecto) {
		this.objecto = objecto;
	}

	public void obtenerTipo() {
		System.out.println("El tipo de T es: "+objecto.getClass().getName());
	}
	
}
