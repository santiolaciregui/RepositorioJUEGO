package Botones;

import javax.swing.ImageIcon;

import Aliados.Bart;
import Clases.Aliado;
import Clases.Tienda;

public class BotonBart extends RoundButton {

	public BotonBart(Tienda tienda) {
		super(tienda);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoBart.png")));
	}
	public Aliado crear() {
		return new Bart(0,0);
	}
}
