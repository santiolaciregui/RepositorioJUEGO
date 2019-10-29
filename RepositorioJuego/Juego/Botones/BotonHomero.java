package Botones;

import javax.swing.ImageIcon;

import Aliados.Homero;
import Clases.Aliado;
import Clases.Tienda;

public class BotonHomero extends RoundButton {
	
	public BotonHomero(Tienda tienda) {
		super(tienda);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoHomeroByN.png")));
	}

	public Aliado crear() {
		return new Homero(0,0);
	}

	@Override
	public void activar() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoHomero.png")));
		
	}

	@Override
	public void desactivar() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoHomeroByN.png")));
		
	}
}
