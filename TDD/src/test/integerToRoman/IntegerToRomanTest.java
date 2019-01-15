package test.integerToRoman;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import main.integerToRoman.IntegerToRoman;

public class IntegerToRomanTest {

	IntegerToRoman conversion = new IntegerToRoman();
	
	@Test
	public void pasar1Romano() {
		String romano = conversion.ConvertirRomanos(25);
		assertEquals(romano, "XXV");
	}
	
	@Test
	public void decimalesRomanas() {
		List<Integer> decimales = Arrays.asList(10,20,30,40,50,60,70,80,90, 82);
		
		
		List<String> romanos = decimales.stream().map( number -> conversion.ConvertirRomanos(number)).collect(Collectors.toList());
		
		assertEquals(romanos.get(0), "X");
		assertEquals(romanos.get(1), "XX");
		assertEquals(romanos.get(2), "XXX");
		assertEquals(romanos.get(3), "XL");
		assertEquals(romanos.get(4), "L");
		assertEquals(romanos.get(5), "LX");
		assertEquals(romanos.get(6), "LXX");
		assertEquals(romanos.get(7), "LXXX");
		assertEquals(romanos.get(8), "XC");
		assertEquals(romanos.get(9), "LXXXII");
	}
	
	@Test
	public void centenasRomanas() {
		List<Integer> decimales = Arrays.asList(100,200,300,400,500,600,700,800,900, 2752);
		
		
		List<String> romanos = decimales.stream().map( number -> conversion.ConvertirRomanos(number)).collect(Collectors.toList());
		
		assertEquals(romanos.get(0), "C");
		assertEquals(romanos.get(1), "CC");
		assertEquals(romanos.get(2), "CCC");
		assertEquals(romanos.get(3), "CD");
		assertEquals(romanos.get(4), "D");
		assertEquals(romanos.get(5), "DC");
		assertEquals(romanos.get(6), "DCC");
		assertEquals(romanos.get(7), "DCCC");
		assertEquals(romanos.get(8), "CM");
		assertEquals(romanos.get(9), "MMDCCLII");
	}
	
}
