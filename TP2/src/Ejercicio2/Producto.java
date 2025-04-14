package Ejercicio2;
import java.time.LocalDate;

public class Producto {
	private LocalDate caducidad;
	private int lote;
	
	public Producto() {
		this.caducidad = LocalDate.now();
		this.lote = 0;
	}
	
	public Producto(LocalDate caducidad, int lote) {
		this.caducidad = caducidad;
		this.lote = lote;
	}

	public LocalDate getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(LocalDate caducidad) {
		this.caducidad = caducidad;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	@Override
	public String toString() {
		return "Producto [caducidad=" + caducidad + ", lote=" + lote + "]";
	}
	
	
}
