package Aliados;

import javax.swing.ImageIcon;

import Clases.Aliado;

public class Lisa extends Aliado {

	public Lisa(int x, int y) {
		super(x,y);
		imagen= new ImageIcon(this.getClass().getResource("/Sprites/Aliados/abuelo.png"));
	}
	

}
