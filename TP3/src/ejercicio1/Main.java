package ejercicio1;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        Archivo archivo = new Archivo("Personas.txt");
        List<Persona> personas = archivo.leerPersonasDesdeArchivo();

        System.out.println("PERSONAS VALIDAS SIN DUPLICADOS:");
        for (Persona p : personas) {
            System.out.println(p);
        }
        
        archivo.escribirPersonasEnArchivo(personas, "Resultado.txt");
    }
    
}
