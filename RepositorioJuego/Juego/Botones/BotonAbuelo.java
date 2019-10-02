package Botones;

import javax.swing.ImageIcon;

import Aliados.Abuelo;
import Clases.Aliado;

public class BotonAbuelo extends RoundButton{
	public BotonAbuelo() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoAbuelo.png")));	
	}

	public Aliado crear() {
		return new Abuelo(0,0);
	}
}
