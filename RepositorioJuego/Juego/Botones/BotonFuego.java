package Botones;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Clases.Tienda;
import ObstaculoTemporal.Llama;

public class BotonFuego extends RoundButton {

	public BotonFuego(Tienda tienda) {
		super(tienda);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoLlamaByn.png")));
	}

	public GameObject crear() {
		return new Llama(0,0);
	}

	@Override
	public void activar() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoLlama.png")));
		
	}

	@Override
	public void desactivar() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoLlamaByN.png")));
		
	}
}
