package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_b {
	public static void main(String[] args) {
		
	//CREACION  DEL TreeSet
	TreeSet<Profesor> ProfesoresSet = new TreeSet<Profesor>();
	
	//INSTANCIAMOS A LOS 5 PROFESORES
	ProfesoresSet.add(new Profesor("Marcos Gutierrez", 29, "Profesor de Ingles", 4));
	ProfesoresSet.add(new Profesor("Fatima Pareto", 62, "Directora", 30));
	ProfesoresSet.add(new Profesor("Marina Gonzales", 45, "Profesor de Fisica Auxiliar", 20));
	ProfesoresSet.add(new Profesor("Carlos Prietto", 56, "Profesor de Matematica Titular", 24));
	ProfesoresSet.add(new Profesor("Mario Basualdo", 38, "Profesor de Historia Titular", 16));
	
	//ITERAMOS EL TreeSet
	Iterator<Profesor> iterator = ProfesoresSet.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
}

}
