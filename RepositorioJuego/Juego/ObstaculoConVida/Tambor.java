package ObstaculoConVida;

import javax.swing.ImageIcon;

import Clases.Obstaculo;

public class Tambor extends ObstaculoConVida{
	
	public Tambor(int x, int y) {
		super(x,y);
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/TamborGif.gif")));
		label.setBounds(x, y+100, 130, 130);
		vida=400;
	}
	
	@Override
	public void mover() {	}
	
	public Obstaculo clonar() {
		return new Tambor(0,0);
	}

	
}