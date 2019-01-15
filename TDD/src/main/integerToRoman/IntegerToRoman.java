package main.integerToRoman;

import java.util.Arrays;
import java.util.List;

public class IntegerToRoman {
	
	public static final List<String> NUMEROS_ROMANOS = Arrays.asList("I", "V", "X", "L", "C", "D", "M");
	
	public String ConvertirRomanos(Integer numeroDecimal) {
		
		char numeroChar[] = numeroDecimal.toString().toCharArray();
		String numeroRomano = "";
		
		int inc = 0;
		for (int i = numeroChar.length-1; i>=0; i--) {
			String romano = generico(Character.getNumericValue(numeroChar[i]), 0+inc, 1+inc, 2+inc);
			
			numeroRomano = romano + numeroRomano;
			inc+=2;
		}
		
		return numeroRomano;
	}

	private String generico(int decena, int x, int y, int z) {
		String numeroRomano = "";

		switch(decena) {
			case 4: return numeroRomano = NUMEROS_ROMANOS.get(x) + NUMEROS_ROMANOS.get(y);
			case 9: return numeroRomano = NUMEROS_ROMANOS.get(x) + NUMEROS_ROMANOS.get(z);
		}

		if(decena <= 3) 
			numeroRomano =  sumar(1, decena, "", NUMEROS_ROMANOS.get(x));
		else if(decena <=8)
			numeroRomano = sumar(6, decena, NUMEROS_ROMANOS.get(y), NUMEROS_ROMANOS.get(x));

		return numeroRomano;
	}

	private String sumar(int inicio, Integer numeroDecimal, String numeroRomano, String digitoRomano) {
		for(int i = inicio; i<=numeroDecimal;i++)
			numeroRomano += digitoRomano;
		
		return numeroRomano;
	}
	
	

}
