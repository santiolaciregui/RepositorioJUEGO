package Botones;
import javax.swing.JPanel;

import Clases.Tienda;


public class ColeccionBotones {
	private RoundButton homero, marge, lisa, bart, abuelo, obstaculo;
	private JPanel panelAbajo;
	public ColeccionBotones(JPanel panel,Tienda tienda) {
		homero= new BotonHomero(tienda);
		marge= new BotonMarge(tienda);
		bart= new BotonBart(tienda);
		lisa= new BotonLisa(tienda);
		abuelo= new BotonAbuelo(tienda);
		obstaculo= new BotonObstaculoConVida(tienda);
		panelAbajo=panel;
		panelAbajo.add(homero);
		panelAbajo.add(marge);
		panelAbajo.add(bart);
		panelAbajo.add(lisa);
		panelAbajo.add(abuelo);
	}
	
	public void agregaraPanel() {
		panelAbajo.add(homero);
		panelAbajo.add(marge);
		panelAbajo.add(bart);
		panelAbajo.add(lisa);
		panelAbajo.add(abuelo);
		panelAbajo.add(obstaculo);
	}
}
