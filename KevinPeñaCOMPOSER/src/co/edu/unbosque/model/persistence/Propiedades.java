package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	
	private Properties prop = new Properties();
	private String archivoprop = "archivo.properties";
	
	public int escribirPropiedades () {
		try {
			prop.setProperty("Estrofas", "3");
			prop.setProperty("Frases", "4");
			prop.store(new FileOutputStream(archivoprop),null);
			
		} catch (IOException e) {
			// TODO: handle exception
			return -1;
		}
		return 0;
	}
	
	public String leerNEstrofas() {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop));
			linea = prop.getProperty("Estrofas");
		
		} catch (IOException e) {
			// TODO: handle exception
			return null;
		}
		
		return linea;
	}
	
	public String leerNFrases() {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop));
			linea = prop.getProperty("Frases");
			
		} catch (IOException e) {
			// TODO: handle exception
			return null;
		}
		
		return linea;
	}

}
