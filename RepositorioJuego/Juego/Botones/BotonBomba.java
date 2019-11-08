package Botones;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Clases.Tienda;
import ObjetoPrecioso.Bomba;

public class BotonBomba extends RoundButton{

	public BotonBomba(Tienda tienda) {
		super(tienda);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoBombaByN.png")));
	}

	public void checkActive() {
		if(this.tienda.hayBomba()) {
			this.activar();
		}else {
			this.desactivar();
		}
	}
	public GameObject crear() {
		GameObject toReturn= new Bomba(0,0);
		tienda.desactivarBomba();
		return toReturn;
	}

	@Override
	public void activar() {
		this.setEnabled(true);
		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoBomba.png")));
		
	}

	@Override
	public void desactivar() {
//		this.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoBombaByN.png")));
		this.setEnabled(false);
	}

}
