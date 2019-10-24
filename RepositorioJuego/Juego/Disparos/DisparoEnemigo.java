package Disparos;

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
		if(this.getLabel().getLocation().x>1250)
			this.vida=0;
	}
	
	public void serColisionado(Colisionador col) {
		col.visitarDisparo(this);
	}
	
	public void atacar(GameObject e) {
		e.disminuirVida(dano);	
		this.vida=0;
	}	

	@Override
	public void parar() {	}

	@Override
	public void morir() {	}

}