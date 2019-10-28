package Obstaculos;

import javax.swing.ImageIcon;
import Clases.GameObject;

public class Tambor extends ObstaculoConVida{
	
	public Tambor(int x, int y) {
		super(x,y);
		monedas=11;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/TamborGif.gif")));
		label.setBounds(x, y, 130, 130);
		vida=100;
	}
	@Override
	public void mover() {	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}
	
}