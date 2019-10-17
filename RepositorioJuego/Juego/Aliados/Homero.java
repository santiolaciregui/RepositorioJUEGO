package Aliados;
import java.util.Random;

import javax.swing.ImageIcon;

import Clases.Aliado;

public class Homero extends Aliado {
	public Homero(int x, int y) {
		super(x,y);
		dano=500;
		vida=1100;
		precio=1500;
		monedas=precio;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroAtacaGif.gif")));
		label.setBounds(x, y,117 , 110);
		
	}
	
	public void atacar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroAtacaGif.gif")));
		
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
	}

	@Override
	public void mover() {  }

}
