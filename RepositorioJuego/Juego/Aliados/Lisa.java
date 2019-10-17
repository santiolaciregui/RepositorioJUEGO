package Aliados;

import javax.swing.ImageIcon;

import Clases.Aliado;

public class Lisa extends Aliado {

	public Lisa(int x, int y) {
		super(x,y);
		dano=200;
		vida=700;
		precio=800;
		monedas=precio;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LisaParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LisaAtacaGif.gif")));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LisaParado.png")));
	}

	@Override
	public void mover() {	}
	

}
