package Aliados;
import javax.swing.ImageIcon;

import Armas.ArmaHomero;
import Clases.Aliado;
import Clases.GameObject;
import Clases.Juego;
import Disparos.Disparo;

public class Homero extends Aliado {
	public Homero( int x, int y) {
		super(x,y);
		dano=500;
		vida=1100;
		precio=1500;
		monedas=precio;
		arma= new ArmaHomero();
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void disparar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroAtacaGif.gif")));
		Disparo pepe = arma.crearDisparo(this.getPos());
//		System.out.println(pepe);
		juego.agregarDisparo(pepe);
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
	}

	@Override
	public void mover() {  }

	@Override
	public void atacar(GameObject e) {
		disparar();
		
	}

}
