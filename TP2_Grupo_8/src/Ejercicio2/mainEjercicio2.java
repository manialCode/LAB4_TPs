package Ejercicio2;

import java.time.LocalDate;

public class mainEjercicio2 {
		
	
	public static void main(String[] args) {
			
			ProductosCongelados PC = new ProductosCongelados(LocalDate.of(2025, 5, 25), 10, 25);
			ProductosFrescos PF = new ProductosFrescos(LocalDate.of(2025, 6, 20), 5, LocalDate.of(2025, 04, 10), "Argentina");
			ProductosRefrigerados PR = new ProductosRefrigerados(LocalDate.of(2025,7,12), 2, 1);
			
			System.out.println(PC.toString());
			System.out.println(PF.toString());
			System.out.println(PR.toString());
		}
}
