package Enemigos;

import javax.swing.ImageIcon;

import Clases.GameObjectGrafico;

public class FlandersGrafico extends GameObjectGrafico{

	public FlandersGrafico(int x, int y) {
		super(x, y);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacarGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersAtacaGif.gif")));
	}
	
	public void pararGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersParado.png")));
	}
	

}