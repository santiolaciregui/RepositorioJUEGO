package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;

public class Moe extends Enemigo {

	public Moe(int x, int y) {
		super(x,y);
		imagen= new ImageIcon(this.getClass().getResource("/Sprites/Aliados/abuelo.png"));
	}

}
