package Botones;

import javax.swing.ImageIcon;

import Aliados.Marge;
import Clases.Aliado;

public class BotonMarge extends RoundButton {
	
	public BotonMarge() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoMarge.png")));
	}

	public Aliado crear() {
		return new Marge(0,0);
	}
}
