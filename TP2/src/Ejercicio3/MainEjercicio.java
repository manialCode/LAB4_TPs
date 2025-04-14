package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio {

	public static void main(String[] args) {
		
		ArrayList<Edificio>ListaEdificios = new ArrayList<Edificio>();
		ListaEdificios.add(new PoliDeportivo("POLI1",1,2));
		ListaEdificios.add(new PoliDeportivo("POLI2",5,4));
		ListaEdificios.add(new PoliDeportivo("POLI3",3,7));
		ListaEdificios.add(new EdificioDeOficinas(3.5,10,15));
		ListaEdificios.add(new EdificioDeOficinas(5,6,20));
		
		
		Iterator<Edificio> it = ListaEdificios.listIterator();
		while (it.hasNext()) {
			Edificio PoliDep = it.next();
			it.remove();
			System.out.println(PoliDep.toString());
		}
	}

}
