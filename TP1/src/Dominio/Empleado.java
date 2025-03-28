package Dominio;

public class Empleado {

	private int id;
	private String nombre;
	private int edad;

	static int cont = 1000;

	// CONSTRUCTORES

	public Empleado() {
		cont++;
		id = cont;
		nombre = "Sin Nombre";
		edad = 99;
	}

	public Empleado(String nombre, int edad) {
		cont++;
		id = cont;
		this.nombre = nombre;
		this.edad = edad;
	}

	// GETTERS Y SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static int devuelveProximoID() {
		return cont + 1;
	}

	public String toString() {
		return "ID del Empleado=" + id + ", Nombre=" + nombre + ", Edad=" + edad;
	}

}
