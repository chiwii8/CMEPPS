package pkg;

public class Calculadora {

	public static int suma(int i, int j) {
		return i+j;
	}

	public static int resta(int i, int j) {
		return i-j;
	}

	public static int multiplica(int i, int j) {
		return i*j;
	}

	public static int divide(int i, int j) {
		if(j!=0)
			return i/j;
		else return -1;
	}

}
