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
	

	@Test
	void test0014(){
		int expectedc12345 = -250;
		int expectedc67890 = -450;
		
		Cuenta c12345 = new Cuenta ("12345","Manuel",50);
		Cuenta c67890 = new Cuenta ("67890","Manuel",0);
		
		c12345.retirar(200);
		c67890.retirar(350);
		c12345.ingresar(100);
		c67890.retirar(200);
		c67890.retirar(150);
		c12345.retirar(200);
		c67890.ingresar(50);
		c67890.retirar(100);
		
		assertEquals(expectedc12345, c12345.getSaldo());
		assertEquals(expectedc67890, c67890.getSaldo());
	}

}
