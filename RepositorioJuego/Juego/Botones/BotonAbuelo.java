package Botones;

import javax.swing.ImageIcon;

import Aliados.Abuelo;
import Clases.Aliado;
import Clases.Tienda;

public class BotonAbuelo extends RoundButton{
	public BotonAbuelo(Tienda tienda) {
		super(tienda);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoAbuelo.png")));	
	}

	public Aliado crear() {
		return new Abuelo(0,0);
	}
}
