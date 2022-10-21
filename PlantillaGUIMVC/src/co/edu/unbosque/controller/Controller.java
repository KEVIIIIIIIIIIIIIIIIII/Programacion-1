package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.ClasePantalla;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private ClasePantalla pantalla;
	private View gui;
	
	public Controller() {
		pantalla = new ClasePantalla();
		gui = new View(this);

		gui.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if (evento.getActionCommand().equals(gui.getPanelEntrada().CONVERTIR)) {
			//String resultado = m.procesarDato(gui.getPanelEntrada().getTxtNumero().getText());
			String resultado1 = pantalla.getY().procesarDatoClaseY(gui.getPanelEntrada().getTxtNumero().getText());
			gui.getPanelResultados().getTxtMonto().setText(resultado1);
		}
		if(evento.getActionCommand().equals(gui.getPanelEntrada().PROCESAR)) {
			String rta2 = pantalla.mensaje();
			gui.getPanelResultados().getTxtMonto().setText(rta2);
		}
	}
}
