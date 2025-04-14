package Ejercicio3;

public class PoliDeportivo extends Edificio implements InstalacionDeportiva {

	private String nombre;
	
	public PoliDeportivo() {
		super();
		this.nombre = "";
	}
	
	public PoliDeportivo(String nombre, double base, double altura) {
		super(base, altura);
		this.nombre = nombre;
	}
	
	@Override
	public int getTipoInstalacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//toString
	@Override
	public String toString() {
		return super.toString() + " Nombre del polideportivo: " + nombre;
	}
	
	

}
