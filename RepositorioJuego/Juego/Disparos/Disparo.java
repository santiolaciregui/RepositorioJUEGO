package Disparos;

import Clases.GameObject;

public abstract class Disparo extends GameObject {
	
	protected Disparo(int damage, int x, int y) {
		super(x,y);
		dano=damage;
		vida=1;
		puntosDeMuerte=0;
	}
}
	