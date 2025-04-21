package ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Archivo {
	
	private String ruta;
	
	public Archivo(String ruta) {
        this.ruta = ruta;
    }
	
	public boolean creaArchivo()
	{
		FileWriter escritura;
		try {
			escritura = new FileWriter(ruta, true);
			escritura.write("");
			escritura.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	//Metodo que lee las personas desde el archivo y las agregar a un set sin duplicados
	public List<Persona> leerPersonasDesdeArchivo() {
	    Set<Persona> personasSet = new HashSet<>(); // evitamos duplicados
	    int descartados = 0;
	    
	    try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
	        String linea;
	        while ((linea = br.readLine()) != null) {
	            String[] partes = linea.split("-");

	            if (partes.length == 3) {
	                String nombre = partes[0].trim();
	                String apellido = partes[1].trim();
	                String dni = partes[2].trim();

	                try {
	                    Dni.verificarDniInvalido(dni);
	                    Persona persona = new Persona(nombre, apellido, dni);
	                    personasSet.add(persona);
	                } catch (DniInvalido e) {
	                	descartados++;
	                    System.out.println("Se descartó persona con DNI inválido: " + e.getMessage());
	                }
	            }
	        }
	    } catch (IOException e) {
	        System.out.println("Error leyendo el archivo: " + e.getMessage());
	    }

	    // Convertimos el set a lista para ordenarlo
	    List<Persona> personasOrdenadas = new ArrayList<>(personasSet);

	    // Ordenamos solo por apellido
	    personasOrdenadas.sort(Comparator.comparing(Persona::getApellido));
	    
	    System.out.println("Total de personas descartadas por DNI inválido: " + descartados);

	    return personasOrdenadas;
	}
	
	public void escribirPersonasEnArchivo(List<Persona> personas, String nombreArchivoSalida) {
	    try (FileWriter fw = new FileWriter(nombreArchivoSalida)) {
	        for (Persona persona : personas) {
	            fw.write(persona.toString() + "\n");
	        }
	        System.out.println("Archivo '" + nombreArchivoSalida + "' generado correctamente.");
	    } catch (IOException e) {
	        System.out.println("Error al escribir en el archivo: " + e.getMessage());
	    }
	}
	
}
