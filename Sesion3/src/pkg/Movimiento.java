package pkg;



public class Movimiento {
	public enum signo{D,H};			///D Ingreso H retirar
							
	
	private double importe;
	private signo s;
	private String detalle;
	
	public Movimiento(double importe,signo s, String detalle) {
		this.importe= importe;
		this.s = s;
		this.detalle = detalle;
	}
	
	public double getImporte() {
		return importe;
	}
	
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public signo getS() {
		return s;
	}
	
	public void setS(signo s) {
		this.s = s;
	}
	
	public String getDetalle() {
		return detalle;
	}
	
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
}
