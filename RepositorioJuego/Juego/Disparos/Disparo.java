package Disparos;

import Clases.Enemigo;
import Clases.GameObject;
import Clases.Juego;

public abstract class Disparo extends GameObject {
	int velocidad;
	
	protected Disparo(Juego game, int damage, int x, int y) {
		super(x,y);
		dano=damage;
		vida=1;
	}
	

	
}
	