package pkg;

import java.util.ArrayList;
import java.util.List;

import pkg.Movimiento.signo;

public class Cuenta {
	private String mNumero;
	private String nTitular;
	private double saldo;
	List<Movimiento> mMovimientos;
	
	public Cuenta(String string, String string2, double saldo) {
		mNumero = string;
		nTitular = string2;
		this.saldo = saldo;
		mMovimientos = new ArrayList<Movimiento>();
		mMovimientos.add(new Movimiento(saldo, signo.D, "Saldo inicial de " + saldo)); 
		System.out.println("Crear la cuenta " + mNumero + " con un saldo inicial de " + this.saldo);
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double ingreso) {
		String detalle = "Ingreso de " + ingreso;
		this.saldo +=ingreso;
		mMovimientos.add( new Movimiento(ingreso,signo.D,detalle));
		
		System.out.println("Ingresa de " + ingreso + " de la cuenta " + mNumero);
	}

	public void retirar(double retirado) {
		String mensaje;
		if(-500<=saldo - retirado) {
			String detalle ="Retiro de " + retirado;
			mMovimientos.add(new Movimiento(retirado,signo.H,detalle)) ;
			this.setSaldo(this.saldo - retirado);	
			mensaje = detalle + " de la cuenta " + mNumero; 
		}else {
					mensaje = "Fondos insuficientes (saldo " + saldo + "€) en la cuenta " + mNumero + " para el reintegro de " + retirado;
		}
		System.out.println(mensaje);
	}

}
