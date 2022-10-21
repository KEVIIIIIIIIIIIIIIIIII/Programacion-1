package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JTextField txtNumero;
	private JLabel espacio1;
	private JLabel espacio2;
	private JButton butConvertir;
	private JButton butProcesar;
	public static final String CONVERTIR = "Convertir";
	public static final String PROCESAR = "Procesar";
	
	public PanelEntrada() {
		setLayout( new GridLayout(2,3) );//se define el grid de 2x2
		TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labEntrada = new JLabel("Digite un Valor");
		espacio1 = new JLabel("");
		espacio2 = new JLabel("");
		txtNumero = new JTextField("");
		txtNumero.setForeground(Color.BLACK);
		txtNumero.setBackground(Color.WHITE);
		butProcesar = new JButton("<<--PROCESAR-->>");
		butProcesar.setActionCommand(PROCESAR);
		butConvertir = new JButton("<<--Convertir-->>");
		butConvertir.setActionCommand(CONVERTIR);
		add(labEntrada);
		add(espacio1);
		add(txtNumero);
		add(butProcesar);
		add(espacio2);
		add(butConvertir);
	}
	
	public JLabel getLabEntrada() {
		return labEntrada;
	}

	public void setLabEntrada(JLabel labEntrada) {
		this.labEntrada = labEntrada;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JButton getButConvertir() {
		return butConvertir;
	}

	public void setButConvertir(JButton butConvertir) {
		this.butConvertir = butConvertir;
	}


	public static String getConvertir() {
		return CONVERTIR;
	}

	/**
	 * @return the espacio1
	 */
	public JLabel getEspacio1() {
		return espacio1;
	}

	/**
	 * @param espacio1 the espacio1 to set
	 */
	public void setEspacio1(JLabel espacio1) {
		this.espacio1 = espacio1;
	}

	/**
	 * @return the espacio2
	 */
	public JLabel getEspacio2() {
		return espacio2;
	}

	/**
	 * @param espacio2 the espacio2 to set
	 */
	public void setEspacio2(JLabel espacio2) {
		this.espacio2 = espacio2;
	}

	/**
	 * @return the butProcesar
	 */
	public JButton getButProcesar() {
		return butProcesar;
	}

	/**
	 * @param butProcesar the butProcesar to set
	 */
	public void setButProcesar(JButton butProcesar) {
		this.butProcesar = butProcesar;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the procesar
	 */
	public static String getProcesar() {
		return PROCESAR;
	}
	
}
