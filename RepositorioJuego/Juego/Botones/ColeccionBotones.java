package Botones;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import GUI.GUI;

public class ColeccionBotones {
	private RoundButton homero, marge, lisa, bart, abuelo;

	public ColeccionBotones() {
		homero= new BotonHomero();
		marge= new BotonMarge();
		bart= new BotonBart();
		lisa= new BotonLisa();
		abuelo= new BotonAbuelo();
	}
	
	public void agregaraPanel(JLayeredPane panelAbajo) {
		panelAbajo.add(homero);
		panelAbajo.add(marge);
		panelAbajo.add(bart);
		panelAbajo.add(lisa);
		panelAbajo.add(abuelo);
		
	}
}
