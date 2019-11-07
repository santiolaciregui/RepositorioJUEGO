package Disparos;

import Clases.Aliado;
import Clases.GameObject;
import Colisionadores.*;

public class DisparoEnemigo extends Disparo{
	public DisparoEnemigo(int damage, int x, int y) {
		super(damage, x, y);
		velocidad=15;
		this.col= new ColDisparoEnemigo(this);
	}

	public void mover() {
		this.setPos(this.getPos().x-velocidad,this.getPos().y);
		if(this.getPos().x>1100 || this.getPos().y<0)
			this.vida=0;
	}
	
	public void serColisionado(Visitor col) {
		col.visitar(this);
	}
	
	public void atacar(GameObject e) {
		e.disminuirVida(dano);	
		this.vida=0;
	}	

	@Override
	public void parar() {	}

}