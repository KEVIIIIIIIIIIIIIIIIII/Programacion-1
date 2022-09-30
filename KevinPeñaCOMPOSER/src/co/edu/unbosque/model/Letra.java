package co.edu.unbosque.model;

import java.util.Iterator;
import java.util.Random;

public class Letra {
	
	private String [][] frases;
	private int nStrofas;
	private int nFrases;
	
	public Letra() {
		frases = new String[4][6];
		nStrofas = 0;
		nFrases = 0;
	}
	
	public String craerLetra() {
		
		Random x = new Random();
		String rta = "";
		String estrofas = "";
		
		frases[0][0] = "Mami ";
		frases[1][0] = "Bebe ";
		frases[2][0] = "Princess ";
		frases[3][0] = "Mami ";
		
		frases[0][1] = " yo quielo ";
		frases[1][1] = " yo puedo ";
		frases[2][1] = " yo vengo a ";
		frases[3][1] = " voy a ";
		
		frases[0][2] = " encendelte";
		frases[1][2] = " amalte ";
		frases[2][2] = " ligal ";
		frases[3][2] = " jugal ";
		
		frases[0][3] = " suave ";
		frases[1][3] = " lento ";
		frases[2][3] = " rapido ";
		frases[3][3] = " fuelte ";
		
		frases[0][4] = " hasta que salga el sol ";
		frases[1][4] = " toda la noche ";
		frases[2][4] = " hasta el amanecer ";
		frases[3][4] = " todo el dia ";
		
		frases[0][5] = "sin anestecia";
		frases[1][5] = " sin compromiso";
		frases[2][5] = " feis to feis";
		frases[3][5] = " sin miedo";
		
		for (int i = 0; i < nStrofas; i++) {
			for (int j = 0; j < nFrases; j++) {
				estrofas += frases[x.nextInt(4)][0] + frases[x.nextInt(4)][1] + frases[x.nextInt(4)][2] + frases[x.nextInt(4)][3] + frases[x.nextInt(4)][4] + 
						    frases[x.nextInt(4)][5] +"\n"; 
			}
			
			rta += estrofas +  "\n";
			estrofas = "";
			
		}
		return rta;
		
	}

	public int getnStrofas() {
		return nStrofas;
	}

	public void setnStrofas(int nStrofas) {
		this.nStrofas = nStrofas;
	}

	public int getnFrases() {
		return nFrases;
	}

	public void setnFrases(int nFrases) {
		this.nFrases = nFrases;
	}
	
	
}
