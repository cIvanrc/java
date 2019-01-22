package main.datos;

import main.excepciones.AccesoDatosEx;

public interface AccesoDatos {
	
	public abstract void insertar() throws AccesoDatosEx;
	public abstract void listar() throws AccesoDatosEx;
	
	public abstract void setSimularError(boolean simularError);
}
