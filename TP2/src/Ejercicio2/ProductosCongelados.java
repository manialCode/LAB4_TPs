package Ejercicio2;

import java.time.LocalDate;

public class ProductosCongelados extends Producto {
	private float tempRefrigeracion;
	
	public ProductosCongelados() {
		super();
		this.tempRefrigeracion = 0;
	}
	
	public ProductosCongelados(LocalDate caducidad, int lote, float temp) {
		super(caducidad, lote);
		this.tempRefrigeracion = temp;
	}

	public float getTempRefrigeracion() {
		return tempRefrigeracion;
	}

	public void setTempRefrigeracion(float tempRefrigeracion) {
		this.tempRefrigeracion = tempRefrigeracion;
	}

	@Override
	public String toString() {
		return  super.toString()+"ProductosCongelados [tempRefrigeracion=" + tempRefrigeracion + "]";
	}
	
}
	
