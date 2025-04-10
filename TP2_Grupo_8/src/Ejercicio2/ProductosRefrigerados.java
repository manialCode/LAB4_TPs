package Ejercicio2;

import java.time.LocalDate;

public class ProductosRefrigerados extends Producto{
	private int supervisor_id;
	
	public ProductosRefrigerados() {
		super();
		this.supervisor_id = 0;
	}
	
	public ProductosRefrigerados(LocalDate caducidad, int lote, int supervisor_id) {
		super(caducidad, lote);
		this.supervisor_id = supervisor_id;
	}

	public int getSupervisor_id() {
		return supervisor_id;
	}

	public void setSupervisor_id(int supervisor_id) {
		this.supervisor_id = supervisor_id;
	}

	@Override
	public String toString() {
		return super.toString() + ", Codigo: " + supervisor_id;
	}
	
}
