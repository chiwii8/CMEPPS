package test;

import empleado.Empleado;
import empleado.Empleado.TipoEmpleado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	private static TipoEmpleado vendedor,encargado;
	private final int nVentas_Default = 0;
	private final int nHorasExtra_Default = 0;
	
	private 
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		vendedor = TipoEmpleado.Vendedor;
		encargado = TipoEmpleado.Encargado;
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculoNominaBrutaVendedor() {	
		float expected = 2000;
		float actual = Empleado.calculoNominaBruta(vendedor,nVentas_Default,nHorasExtra_Default);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEncargado() {
		float expected = 2500;
		float actual = Empleado.calculoNominaBruta(encargado,nVentas_Default,nHorasExtra_Default);
		assertEquals(expected, actual);
	}
	
	/*
	 * No se puede producir un tipoEmpleado con otro valor que no se haya definido por lo que se ha recurrido a una 
	 * llamada a valueOf() para poder emplear otro tipo,
	 * pero como no existe salta una excepcion que debería controlarse y al saltar dicha excepción se considera como fail
	 * ya que no debería seguir ejecutándose
	 * */
	@Test
	void testCalculoNominaBrutaOtro() {
		float expected = -1;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.valueOf("Otro"),nVentas_Default, nHorasExtra_Default);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaVentasNegativas() {
		float expected = 2000;
		float actual = Empleado.calculoNominaBruta(vendedor, -200, nHorasExtra_Default);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaVentasPositivas0y1000() {
		float expected = 2000;
		float actual = Empleado.calculoNominaBruta(vendedor, 900, nHorasExtra_Default);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaVentasPositivas1000y1500() {
		float expected = 2100;
		float actual = Empleado.calculoNominaBruta(vendedor, 1100, nHorasExtra_Default);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaVentasPositivas1500mayor() {
		float expected = 2200;
		float actual = Empleado.calculoNominaBruta(vendedor, 1600, nHorasExtra_Default);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtraNegativas() {
		float expected = 2000;
		float nHorasExtra = -5;
		float actual = Empleado.calculoNominaBruta(vendedor, nVentas_Default, nHorasExtra);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtraPositivas() {
		float expected = 2150;
		float nHorasExtra = 5;
		float actual = Empleado.calculoNominaBruta(vendedor, nVentas_Default, nHorasExtra);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNeta() {
		fail("Not yet implemented");
	}

}
