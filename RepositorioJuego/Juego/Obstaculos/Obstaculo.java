package Obstaculos;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Inteligencias.Inteligencia;


public abstract class Obstaculo extends GameObject{
	
	public Obstaculo(int x, int y, int vida) {
		super(x,y);
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/TamborGif.gif")));
		setBounds(x, y, 130, 50);
		this.vida=vida;
	}
	
}