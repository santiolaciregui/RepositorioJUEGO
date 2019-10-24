package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;

public class Moe extends Enemigo {

	public Moe(int x, int y) {
		super(x, y);
		dano=500;
		vida=1200;
		monedas=1000;
		puntosDeMuerte=1500;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MoeParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacarGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MoeAtacaGif.gif")));
	}
	
	public void pararGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MoeParado.png")));
	}

	@Override
	public Enemigo clonar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}
	

}