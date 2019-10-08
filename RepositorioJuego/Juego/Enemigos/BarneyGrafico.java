package Enemigos;

import javax.swing.ImageIcon;

import Clases.GameObjectGrafico;

public class BarneyGrafico extends GameObjectGrafico{

	public BarneyGrafico(int x, int y) {
		super(x, y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BarneyParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacarGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BarneyAtacaGif.gif")));
	}
	
	public void pararGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BarneyParado.png")));
	}
	

}