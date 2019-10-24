package Aliados;

import javax.swing.ImageIcon;

import Clases.Aliado;
import Clases.GameObject;

public class Lisa extends Aliado {

	public Lisa(int x, int y) {
		super(x,y);
		dano=60;
		vida=700;
		precio=800;
		monedas=precio;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LisaParada.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LisaAtacaGif.gif")));
		e.disminuirVida(dano);
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/LisaParada.png")));
	}

	@Override
	public void mover() {	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}
	

}
