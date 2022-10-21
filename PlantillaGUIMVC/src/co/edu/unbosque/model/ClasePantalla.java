package co.edu.unbosque.model;

public class ClasePantalla {

	private ClaseY y;
	
	public ClasePantalla() {
		// TODO Auto-generated constructor stub
		y = new ClaseY();
	}
	
	public String mensaje() {
		return "Se proceso el boton procesar.";
	}

	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}


	/* metodo que realiza un proceso basado en un par�metro "dato" 
	 * y retorne el dato procesado. Reemplazar por lo que se necesiten
	 */
	public String procesarDato(String dato) {
		dato = dato + " procesado";
		return dato;
	}
}
