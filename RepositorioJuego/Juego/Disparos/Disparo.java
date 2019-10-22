package Disparos;

import Clases.Enemigo;
import Clases.GameObject;

public abstract class Disparo extends GameObject {
	int velocidad;
	
	protected Disparo(int damage, int x, int y) {
		super(x,y);
		dano=damage;
		vida=1;
	}
	

	
}
	