package test;

import static org.junit.jupiter.api.Assertions.*;
import calculadora.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private int value1,value2,value3;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each");
		value1 = 2;
		value2 = 3;
		value3 = 0;
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}

	@Test
	void testSuma() {
		int expected = 5;
		int actual = Calculadora.suma(value1,value2);
		assertEquals(expected, actual);
	}

	@Test
	void testResta() {
		int expected = -1;
		int actual = Calculadora.resta(value1,value2 );
		assertEquals(expected, actual);
	}

	@Test
	void testMultiplica() {
		int expected = 6;
		int actual = Calculadora.multiplica(value1,value2 );
		assertEquals(expected,actual);
	}

	@Test
	void testDivide() {
		int expected = 1;
		int actual = Calculadora.divide(value2,value1 );
		assertEquals(expected,actual);
	}
	
	@Test
	void testDividepor0() {
		int expected = - 1;
		int actual = Calculadora.divide(value3,value2 );
		assertEquals(expected,actual);
	}

}
