package Botones;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Clases.Tienda;
import ObjetoPrecioso.Bomba;
import ObstaculoConVida.Tambor;

public class BotonBomba extends RoundButton{

	public BotonBomba(Tienda tienda) {
		super(tienda);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoBomba.png")));
	}

	public GameObject crear() {
		return new Bomba(0,0);
	}

}
