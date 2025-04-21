package ejercicio1;


public class Dni {

    private String dniCode;

    public Dni() {}

    public Dni(String dni) {
        this.setDni(dni);
    }

    public static void verificarDniInvalido(String dni) throws DniInvalido {
        for (int i = 0; i < dni.length(); i++) {
            char c = dni.charAt(i);
            if (!Character.isDigit(c)) {
                throw new DniInvalido("DNI inválido: contiene '" + c + "'");
            }
        }
    }

	public String getDni() {
		return dniCode;
	}

	public void setDni(String dni) {
		this.dniCode = dni;
	}
}