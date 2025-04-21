package ejercicio1;


import java.util.Objects;

public class Persona {
	
	private String nombre;
    private String apellido;
    private String dni;
    
    public Persona(){}
    
    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    //GETS
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return dni.equals(persona.dni); // Duplicados si tienen mismo DNI
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return apellido + " " + nombre + " - " + dni;
    }
}
