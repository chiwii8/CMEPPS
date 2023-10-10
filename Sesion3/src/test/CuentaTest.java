package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	static Cuenta cuenta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta("12345","Manuel",0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngreso() {
		int expected = 1000;
		cuenta.ingresar(1000);
		assertEquals(expected,cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(500);
		assertEquals(cuenta.getSaldo(),-500);
	}

}