package Enemigos;

import javax.swing.ImageIcon;

import Clases.Enemigo;

public class BobPatino extends Enemigo {

	public BobPatino(int x, int y) {
		super(x,y);
		imagen= new ImageIcon(this.getClass().getResource("/Sprites/Aliados/abuelo.png"));
	}

}
