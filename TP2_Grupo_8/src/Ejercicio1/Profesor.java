package Ejercicio1;


import java.util.Objects;

public class Profesor extends Empleado implements Comparable<Profesor>{

	private String cargo;
	private int antiguedadDocente;
	
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
	
	//CONSTRUCTORES
	public Profesor(){
		super();
		cargo = "-------";
		antiguedadDocente = 0;
	}
	
	public Profesor(String nombre, int edad,String cargo, int antiguedadDocente){
	super(nombre, edad);
	this.cargo = cargo;
	this.antiguedadDocente = antiguedadDocente;
	}

	//toString
	@Override
    public String toString() {
        return super.toString() + ", Cargo = " + cargo + ", Antigüedad Docente = " + antiguedadDocente;
    }
	
	//compareTo DESCENDENTE 
	@Override
	public int compareTo(Profesor otroProfesor) {
		return Integer.compare(otroProfesor.getAntiguedadDocente(), this.antiguedadDocente);
	}
	
	//HashCode
	@Override
	public int hashCode() {
		return Objects.hash(antiguedadDocente, cargo);
	}
	
	//Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		return antiguedadDocente == other.antiguedadDocente && Objects.equals(cargo, other.cargo);
	}
	
	
	
}
