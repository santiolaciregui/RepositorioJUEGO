package Botones;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Clases.Tienda;
import ObstaculoConVida.AutoPolicia;
import ObstaculoConVida.Tambor;

public class BotonPolicia extends RoundButton{

	public BotonPolicia(Tienda tienda) {
		super(tienda);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoPoliciaByN.png")));
	}

	public GameObject crear() {
		return new AutoPolicia(0,0);
	}

	@Override
	public void activar() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoPolicia.png")));
		
	}

	@Override
	public void desactivar() {
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoPoliciaByN.png")));
		
	}
	
}
