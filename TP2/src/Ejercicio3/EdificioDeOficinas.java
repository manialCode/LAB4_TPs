package Ejercicio3;

public class EdificioDeOficinas extends Edificio {
	
	private int cantidadOficinas;
	
	public EdificioDeOficinas() {
		super();
		this.cantidadOficinas = 0;
	}
	
	public EdificioDeOficinas(double base, double altura, int cantidadOficinas) {
		super(base, altura);
		this.cantidadOficinas = cantidadOficinas;
	}

	public int getCantidadOficinas() {
		return cantidadOficinas;
	}

	public void setCantidadOficinas(int cantidadOficinas) {
		this.cantidadOficinas = cantidadOficinas;
	}

	//toString
	@Override
	public String toString() {
		return super.toString() + " Cantidad de oficinas: " + cantidadOficinas;
	}
	
	

}
