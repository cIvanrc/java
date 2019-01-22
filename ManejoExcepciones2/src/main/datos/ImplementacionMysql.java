package main.datos;

import main.excepciones.AccesoDatosEx;
import main.excepciones.EscrituraDatosEx;
import main.excepciones.LecturaDatosEx;

public class ImplementacionMysql implements AccesoDatos{
	private boolean simularError;
	
	@Override
	public void insertar() throws AccesoDatosEx{
		if(simularError)
			throw new EscrituraDatosEx("Error de escritura de datos");
		else
			System.out.println("Insertar desde Mysql");
	}
	
	@Override
	public void listar() throws AccesoDatosEx{
		if(simularError)
			throw new LecturaDatosEx("Error lectura de datos");
		else
			System.out.println("Lectura desde Mysql");
	}

	public boolean isSimularError() {
		return simularError;
	}

	@Override
	public void setSimularError(boolean simularError) {
		this.simularError = simularError;
	}

}
