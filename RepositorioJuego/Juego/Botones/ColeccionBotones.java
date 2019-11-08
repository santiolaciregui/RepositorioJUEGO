package Botones;
import javax.swing.JPanel;
import Clases.Tienda;


public class ColeccionBotones {
	private RoundButton homero, marge, lisa, bart, abuelo, bomba;
	private RoundButton [] botones;
	private JPanel panelAbajo;
	public ColeccionBotones(JPanel panel,Tienda tienda) {
		botones= new RoundButton[6];
		botones[0]= new BotonHomero(tienda);
		botones[1] = new BotonMarge(tienda);
		botones[2] = new BotonBart(tienda);
		botones[3] = new BotonLisa(tienda);
		botones[4] = new BotonAbuelo(tienda);
		botones[5] = new BotonBomba(tienda);
		panelAbajo = panel;
		agregarAPanel();
	}
	
	public void agregarAPanel() {
		for(RoundButton e: botones)
			panelAbajo.add(e);
	}
	
	public void actualizar() {
		for(RoundButton e: botones) {
			e.checkActive();
		}
	}
}
