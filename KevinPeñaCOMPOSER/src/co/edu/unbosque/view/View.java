package co.edu.unbosque.view;

import java.io.File;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View {

	public void mostar(String msg) {
		Random r = new Random();
		String imagen = String.valueOf(r.nextInt(4));
		System.out.println(imagen);
		ImageIcon img = new ImageIcon("img/"+imagen+".jpg");
		JOptionPane.showMessageDialog(null, msg,"", 0, img);
	}
	
	public File chooser() {
		JFileChooser j = new JFileChooser();
		j.showSaveDialog(j);
		File f = j.getSelectedFile();
		return f;
	}
	
}
