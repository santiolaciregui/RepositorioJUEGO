package Botones;

import javax.swing.ImageIcon;

import Aliados.Lisa;
import Clases.Aliado;

public class BotonLisa extends RoundButton {
	
	public BotonLisa() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoLisa.png")));
	}

	public Aliado crear() {
		return new Lisa(0,0);
	}
}
