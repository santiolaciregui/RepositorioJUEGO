package Botones;

import javax.swing.ImageIcon;

import Aliados.Lisa;
import Clases.Aliado;
import Clases.Tienda;

public class BotonLisa extends RoundButton {
	
	public BotonLisa(Tienda tienda) {
		super(tienda);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoLisaByN.png")));
	}

	public Aliado crear() {
		return new Lisa(0,0);
	}

	@Override
	public void activar() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoLisa.png")));
		
	}

	@Override
	public void desactivar() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoLisaByN.png")));
		
	}
}
