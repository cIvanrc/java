package ejemplopolimorfismo;

public class EjemploPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleado = new Empleado("ivan", 312312);
		imprimirDetalles(empleado);
		
		Gerente gerente = new Gerente("ivan2", 2000000, "informatica");
		imprimirDetalles(gerente);
		
	}
	
	public static void imprimirDetalles(Empleado emp) {
		System.out.println(emp.obtenerDetalles());
	}

}
