package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;

public class Flanders extends Enemigo {

	public Flanders(int x, int y) {
		super(x,y);
		imagen= new ImageIcon(this.getClass().getResource("/Sprites/Aliados/abuelo.png"));
	}

}
