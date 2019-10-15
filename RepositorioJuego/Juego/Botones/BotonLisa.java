package Botones;

import javax.swing.ImageIcon;

import Aliados.Lisa;
import Clases.Aliado;
import Clases.Tienda;

public class BotonLisa extends RoundButton {
	
	public BotonLisa(Tienda tienda) {
		super(tienda);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoLisa.png")));
	}

	public Aliado crear() {
		return new Lisa(0,0);
	}
}
