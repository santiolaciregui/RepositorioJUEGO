package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;

public class Barney extends Enemigo {

	public Barney(int x, int y) {
		super(x,y);
		imagen= new ImageIcon(this.getClass().getResource("/Sprites/Aliados/abuelo.png"));
	}
	
}
