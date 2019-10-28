package Botones;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Clases.Tienda;
import ObstaculoConVida.Tambor;

public class BotonTambor extends RoundButton{

	public BotonTambor(Tienda tienda) {
		super(tienda);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoTambor.png")));
	}

	public GameObject crear() {
		return new Tambor(0,0);
	}
	
}
