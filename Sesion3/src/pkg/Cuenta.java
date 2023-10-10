package pkg;

public class Cuenta {
	private double saldo;
	
	public Cuenta(String string, String string2, int saldo) {
		super();
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public void ingresar(double ingreso) {
		saldo+=ingreso;
	}

	public void retirar(double retirado) {
			this.setSaldo(this.saldo - retirado);
	}

	
}
