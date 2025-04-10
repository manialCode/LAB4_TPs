package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio1_a {

	public static void main(String[] args) {
//		Creacion de arrayList de profesores
		ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>(5);
		
//		Instancias de la clase profesores
		  Profesor profesor1 = new Profesor("Carlos Pérez", 45, "Director", 20);
	      Profesor profesor2 = new Profesor("Ana Gómez", 38, "Jefe de Departamento", 15);
	      Profesor profesor3 = new Profesor("Luis Rodríguez", 50, "Profesor Titular", 25);
	      Profesor profesor4 = new Profesor("María López", 30, "Profesor Auxiliar", 5);
	      Profesor profesor5 = new Profesor("Javier Morales", 42, "Coordinador Académico", 18);
	
//	      Añadido de intancias a la lista
	      listaProfesores.add(profesor1);
	      listaProfesores.add(profesor2);
	      listaProfesores.add(profesor3);
	      listaProfesores.add(profesor4);
	      listaProfesores.add(profesor5);
	      
//	      Creacion de iterador para recorrer la lista y imprimirla en la terminal
	      Iterator<Profesor> it = listaProfesores.iterator();
	      while(it.hasNext()) {
//	    	  Castear el iterador a un profesor.
	    	  Profesor p = (Profesor) it.next();
	    	  System.out.println(p.toString());
	      }
	}

}
