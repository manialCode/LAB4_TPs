package ejercicio1;

import java.io.IOException;

public class DniInvalido extends IOException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DniInvalido(String mensaje) {
        super(mensaje);
    }
    
    public DniInvalido(){
    	super("DNI inválido: contiene caracteres no numéricos.");
    }
}
 