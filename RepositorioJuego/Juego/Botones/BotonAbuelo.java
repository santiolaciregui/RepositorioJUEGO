package Botones;

import javax.swing.ImageIcon;

import Aliados.Abuelo;
import Clases.Aliado;
import Clases.Tienda;

public class BotonAbuelo extends RoundButton{
	public BotonAbuelo(Tienda tienda) {
		super(tienda);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoAbueloByN.png")));	
	}

	public Aliado crear() {
		return new Abuelo(0,0);
	}

	@Override
	public void activar() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoAbuelo.png")));		
	}

	@Override
	public void desactivar() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoAbueloByN.png")));
	}
}
