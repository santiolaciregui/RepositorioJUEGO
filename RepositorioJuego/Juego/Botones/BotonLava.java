package Botones;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Clases.Tienda;
import ObstaculoTemporal.Lava;

public class BotonLava extends RoundButton {

	public BotonLava(Tienda tienda) {
		super(tienda);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoLava.png")));
	}

	public GameObject crear() {
		return new Lava(0,0);
	}
}
