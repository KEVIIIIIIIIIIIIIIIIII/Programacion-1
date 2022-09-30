package co.edu.unbosque.controller;

import co.edu.unbosque.model.Cancion;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View vista;
	private Cancion cancion;
	
	public Controller() {
		vista = new View();
		cancion = new Cancion();
		funcionar();
	}

	public void funcionar() {
		// TODO Auto-generated method stub
		cancion.gestionarArchivoPropiedades();
		
		vista.mostar(cancion.getLetra().craerLetra());
		
		cancion.gestionarArchivoCadena(vista.chooser());
		
	}

}
