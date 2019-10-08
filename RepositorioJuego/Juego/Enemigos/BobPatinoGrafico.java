package Enemigos;

import javax.swing.ImageIcon;

import Clases.GameObjectGrafico;

public class BobPatinoGrafico extends GameObjectGrafico{

	public BobPatinoGrafico(int x, int y) {
		super(x, y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BobPatinoParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacarGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BobPatinoAtacaGif.gif")));
	}
	
	public void pararGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BobPatinoParado.png")));
	}
	

}