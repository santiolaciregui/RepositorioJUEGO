package Botones;
import javax.swing.JPanel;


public class ColeccionBotones {
	private RoundButton homero, marge, lisa, bart, abuelo;
	private JPanel panelAbajo;
	public ColeccionBotones(JPanel panel) {
		homero= new BotonHomero();
		marge= new BotonMarge();
		bart= new BotonBart();
		lisa= new BotonLisa();
		abuelo= new BotonAbuelo();
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
	}
}
