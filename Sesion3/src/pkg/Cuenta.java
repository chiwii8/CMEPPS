package pkg;

public class Cuenta {
	private String mNumero;
	private String nTitular;
	private double saldo;
	
	public Cuenta(String string, String string2, int saldo) {
		mNumero = string;
		nTitular = string2;
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
		if(retirado<=this.saldo)
			this.setSaldo(this.saldo - retirado);
	}

	
}
