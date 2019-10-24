package Aliados;
import java.util.Random;

import javax.swing.ImageIcon;

import Armas.ArmaHomero;
import Clases.Aliado;
import Clases.GameObject;

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
		int s=  (int) (Math.random() * 50) + 1;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroAtacaGif.gif")));
		if(s==2)
			juego.agregarDisparo(arma.crearDisparo(this.getPos()));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
	}

	@Override
	public void mover() { disparar(); }

	@Override
	public void atacar(GameObject e) {
		disparar();
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}

}
