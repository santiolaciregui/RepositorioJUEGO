package Aliados;
import javax.swing.ImageIcon;

import Clases.Aliado;

public class Maggie extends Aliado {

	public Maggie(int x, int y) {
		super(x,y);
		imagen= new ImageIcon(this.getClass().getResource("/Sprites/Aliados/abuelo.png"));
	}

}
