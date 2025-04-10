package Ejercicio3;

public abstract class InstalacionDeportiva{
	

	private int tipo;

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Tipo: " + tipo;
	}
	
	public abstract int getTipoDeInstalacion();
	
}