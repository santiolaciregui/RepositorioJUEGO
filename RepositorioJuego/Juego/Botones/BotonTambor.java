package Botones;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Clases.Tienda;

public class BotonTambor extends RoundButton{

	public BotonTambor(Tienda tienda) {
		super(tienda);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoTambor.png")));
	}

	public GameObject crear() {
		return null;
	}
	
}
