package Botones;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Clases.Tienda;
import ObstaculoConVida.AutoPolicia;
import ObstaculoConVida.Tambor;

public class BotonPolicia extends RoundButton{

	public BotonPolicia(Tienda tienda) {
		super(tienda);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BotonPolicia.png")));
	}

	public GameObject crear() {
		return new AutoPolicia(0,0);
	}
	
}
