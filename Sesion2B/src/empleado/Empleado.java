package empleado;

public class Empleado {
	public enum TipoEmpleado{Vendedor,Encargado,Otro};
	private final static float VALOR_HORAS_EXTRA = 30;
	
	public static float calculoNominaBruta(TipoEmpleado tipo,float ventasMes, float horasExtra)throws IllegalArgumentException{
		int salarioBase = -1;
		int primas = 0;
		float valorHorasExtra = horasExtra>0? horasExtra*VALOR_HORAS_EXTRA:0;
		
		
		if(tipo == TipoEmpleado.Vendedor) {
			salarioBase = 2000;
		}else if(tipo == TipoEmpleado.Encargado){
			salarioBase = 2500;
		}
		
		if(ventasMes>1500) {
			primas = 200;
		}
		else if(ventasMes >1000) {
			primas = 100;
		}else {
			primas = 0;
		}
		
		if(salarioBase!=-1)
			return salarioBase + primas + valorHorasExtra;
		else
			return salarioBase;
}
	
	public static float calculoNominaNeta(float nominaBruta) {
		float retencion = 0;
		
		if(nominaBruta >=2500) {
			retencion = 0.18f;
		}
		else if(nominaBruta > 2100){
			retencion = 0.15f; 
		}else if(nominaBruta<0) {
			return -1;
		}
		
		return nominaBruta*(1-retencion);
	}
}
