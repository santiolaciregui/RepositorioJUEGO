package Botones;

import javax.swing.ImageIcon;

import Aliados.Marge;
import Clases.Aliado;
import Clases.Tienda;

public class BotonMarge extends BotonPersonaje {
	
	public BotonMarge(Tienda tienda) {
		super(tienda);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoMargeByN.png")));
	}

	public Aliado crear() {
		return new Marge(0,0);
	}

	@Override
	public void activar() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoMarge.png")));
		
	}

	@Override
	public void desactivar() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoMargeByN.png")));
		
	}
}
