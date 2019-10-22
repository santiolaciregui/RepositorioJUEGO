package Aliados;
import javax.swing.ImageIcon;

import Armas.ArmaHomero;
import Clases.Aliado;
import Clases.GameObject;

public class Homero extends Aliado {
	public Homero(int x, int y) {
		super(x,y);
		dano=500;
		vida=1100;
		precio=1500;
		monedas=precio;
		arma= new ArmaHomero();
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
		label.setBounds(x, y,117 , 110);
		atacar();
	}
	
	public void atacar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroAtacaGif.gif")));
//		juego.agregarDisparo(arma.crearDisparo(this.getPos()));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
	}

	@Override
	public void mover() {  }

	@Override
	public void atacar(GameObject e) {
		// TODO Auto-generated method stub
		
	}

}
