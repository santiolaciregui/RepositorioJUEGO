package Obstaculos;

import javax.swing.ImageIcon;

import Clases.GameObject;

public abstract class Obstaculo extends GameObject{
	
	public Obstaculo(int x, int y, int vida) {
		super(x,y);
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/TamborGif.gif")));
		this.vida=vida;
	}
	
}