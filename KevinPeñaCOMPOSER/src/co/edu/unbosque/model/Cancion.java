package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.ArchivoTxt;
import co.edu.unbosque.model.persistence.Propiedades;

public class Cancion {
	
	private Letra letra;
	private ArchivoTxt txt;
	private Propiedades prop;
	
	
	public Cancion() {
		letra = new Letra();
		txt = new ArchivoTxt();
		prop = new Propiedades();
	}
	
	public void gestionarArchivoPropiedades() {
		prop.escribirPropiedades();
		letra.setnStrofas(Integer.parseInt(prop.leerNEstrofas()));
		letra.setnFrases(Integer.parseInt(prop.leerNFrases()));
		
	}
	
	public void gestionarArchivoCadena(File f) {
		txt.escribirArchivo(letra.craerLetra(), f);
		
	}

	public Letra getLetra() {
		return letra;
	}

	public void setLetra(Letra letra) {
		this.letra = letra;
	}
	
	

}
