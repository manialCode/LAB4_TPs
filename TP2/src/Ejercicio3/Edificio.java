package Ejercicio3;

public abstract class Edificio {
	
	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	Edificio(){
		this.base = 0;
		this.altura = 0;
	}
	
	Edificio(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public double getSuperficeEdificio() {
		return base * altura;
	}
	
	//toString
	@Override
	public String toString() {
		return "La base del Edificio es de= " + base + " y su altura es de= " + altura + ".";
	}
	
	
}


