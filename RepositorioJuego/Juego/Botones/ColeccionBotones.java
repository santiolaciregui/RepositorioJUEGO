package Botones;
import javax.swing.JPanel;

import Clases.Tienda;


public class ColeccionBotones {
	private RoundButton homero, marge, lisa, bart, abuelo, tambor, fuego, bomba, lava, autoPoli;
	private JPanel panelAbajo;
	public ColeccionBotones(JPanel panel,Tienda tienda) {
		homero = new BotonHomero(tienda);
		marge = new BotonMarge(tienda);
		bart = new BotonBart(tienda);
		lisa = new BotonLisa(tienda);
		abuelo = new BotonAbuelo(tienda);
		tambor = new BotonTambor(tienda);
		fuego = new BotonFuego(tienda);
		bomba = new BotonBomba(tienda);
		lava = new BotonLava(tienda);
		autoPoli = new BotonPolicia(tienda);
		panelAbajo = panel;
		agregarAPanel();
	}
	
	public void agregarAPanel() {
		panelAbajo.add(homero);
		panelAbajo.add(marge);
		panelAbajo.add(bart);
		panelAbajo.add(lisa);
		panelAbajo.add(abuelo);
		panelAbajo.add(fuego);
		panelAbajo.add(tambor);
		panelAbajo.add(bomba);
		panelAbajo.add(lava);
		panelAbajo.add(autoPoli);
		}
}
