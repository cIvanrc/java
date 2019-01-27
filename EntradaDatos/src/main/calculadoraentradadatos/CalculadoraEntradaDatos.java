package main.calculadoraentradadatos;

import static main.calculadoraentradadatos.Operaciones.*;

import java.util.Scanner;

public class CalculadoraEntradaDatos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el primer valor:");

		int a = scan.nextInt();
		
		System.out.println("Ingrese el segundo valor:");
		int b = scan.nextInt();
		
		int resultado = sumar(a,b);
				
		System.out.println("El resultado es: "+resultado);
		
	}
}
