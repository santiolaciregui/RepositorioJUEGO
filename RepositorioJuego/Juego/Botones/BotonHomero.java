package Botones;

import javax.swing.ImageIcon;

import Aliados.Homero;
import Clases.Aliado;

public class BotonHomero extends RoundButton {
	
	public BotonHomero() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoHomero.png")));
	}

	public Aliado crear() {
		return new Homero(0,0);
	}
}
