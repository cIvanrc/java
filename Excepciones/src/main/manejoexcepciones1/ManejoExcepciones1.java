package main.manejoexcepciones1;

import main.domain.Division;
import main.domain.OperationExcepcion;

public class ManejoExcepciones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Division division = new Division(10, 0);
				division.visualizarOperacion();
		}catch(OperationExcepcion oe) {
			System.out.println("Ocurrio un errorr!!");
			oe.printStackTrace();
		}
	}

}
