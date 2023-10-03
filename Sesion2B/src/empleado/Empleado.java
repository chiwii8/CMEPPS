package empleado;

public class Empleado {
	private float VALOR_HORAS_EXTRA = 30;
	public enum TipoEmpleado{Vendedor,Encargado};
	
	public float calculoNominaBruta(TipoEmpleado tipo,float ventasMes, float horasExtra) {
		int salarioBase;
		int primas = 0;
		float valorHorasExtra = horasExtra*VALOR_HORAS_EXTRA;
		if(tipo == TipoEmpleado.Vendedor) {
			salarioBase = 2000;
		}else {
			salarioBase = 2500;
		}
		
		if(ventasMes >1000 && ventasMes <=1500) {
			primas = 100;
		}else if(ventasMes>1500) {
			primas = 200;
		}
		
		
		
		return salarioBase + primas + valorHorasExtra;
	}
	
	public float calculoNominaNeta(float nominaBruta) {
		float retencion = 0;
		
		if(nominaBruta >=2500) {
			retencion = 0.18f;
		}
		else if(2100< nominaBruta ){
			retencion = 0.15f; 
		}
		
		return nominaBruta*(1-retencion);
	}
}
