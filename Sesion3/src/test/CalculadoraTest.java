package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
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
	void testSuma() {
		int expected = 10;
		int actual = Calculadora.suma(5,5);
		assertEquals(actual, expected);
	}
	@Test
	void testResta() {
		int expected = 0;
		int actual = Calculadora.resta(5,5);
		assertEquals(actual, expected);
		
	}
	void testMultiplica() {
		int expected = 25;
		int actual = Calculadora.multiplica(5,5);
		assertEquals(actual, expected);
		
	}
	void testDivide() {
		int expected = 1;
		int actual = Calculadora.divide(5,5);
		assertEquals(actual, expected);
		
	}
	

}
