package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

public class ArchivoTxt {
	
	public int escribirArchivo(String dato, File f) {
		
		try {
			if(f == null) {
				//como controlar el null cuando le dan cancelar
			}
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(dato);
			
			fw.close();
			
		} catch (IOException e) {
			
			return -1;
		}
		return 0;
	}

}
