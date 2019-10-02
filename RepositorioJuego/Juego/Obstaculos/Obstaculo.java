package Obstaculos;

import Clases.GameObject;
import Inteligencias.Inteligencia;


public abstract class Obstaculo extends GameObject{
	
	public Obstaculo(int x, int y, int vida) {
		super(x,y);
		setBounds(x, y, 130, 50);
		this.vida=vida;
	}
	
}