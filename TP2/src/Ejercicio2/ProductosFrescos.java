package Ejercicio2;

import java.time.LocalDate;

public class ProductosFrescos extends Producto {
	private LocalDate envasado;
	private String origen;
	
	public ProductosFrescos() {
		super();
		this.envasado = LocalDate.now();
		this.origen = "no especificado";
	}
	
	public ProductosFrescos(LocalDate caducidad, int lote, LocalDate envasado ,String origen) {
		super(caducidad, lote);
		this.envasado = envasado;
		this.origen = origen;
	}

	public LocalDate getEnvasado() {
		return envasado;
	}

	public void setEnvasado(LocalDate envasado) {
		this.envasado = envasado;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return super.toString() + "ProductosFrescos [envasado=" + envasado + ", origen=" + origen + "]";
	}
	
	
}
