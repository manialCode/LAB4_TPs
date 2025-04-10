package Ejercicio1;

public class Main_a {
	public static void main(String[] args) {
		Profesor profe1 = new Profesor("Juan", 35, "Profesor Titular", 10);
		Profesor profe2 = new Profesor("Juan", 35, "Profesor Titular", 10);

		System.out.println("");
		System.out.println("");

		if (profe1.equals(profe2)) {
		    System.out.println("Es el mismo profesor.");
		} else {
		    System.out.println("No es el mismo profesor.");
		}

	}
}
