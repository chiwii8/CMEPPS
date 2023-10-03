package empleado;

public class Empleado {
	public enum TipoEmpleado{Vendedor,Encargado};
	private final static float VALOR_HORAS_EXTRA = 30;
	
	public static float calculoNominaBruta(TipoEmpleado tipo,float ventasMes, float horasExtra){
		int salarioBase;
		int primas = 0;
		float valorHorasExtra = horasExtra>0? horasExtra*VALOR_HORAS_EXTRA:0;
		
		try {
			if(tipo == TipoEmpleado.Vendedor) {
				salarioBase = 2000;
			}else {
				salarioBase = 2500;
			}
		}catch(IllegalArgumentException e) {
			System.out.println("El tipo de empleado no se ha especificado correctamente");
			return -1;
		};
		
		
		if(ventasMes>1500) {
			primas = 200;
		}
		else if(ventasMes >1000) {
			primas = 100;
		}else {
			primas = 0;
		}
		
		
		return salarioBase + primas + valorHorasExtra;
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
