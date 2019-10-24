package Disparos;

import javax.swing.ImageIcon;
import Clases.GameObject;
import Colisionadores.ColDisparoAliado;
import Colisionadores.Colisionador;

public class DisparoAliado extends Disparo{
	public DisparoAliado(int damage, int x, int y) {
		super(damage, x, y);
		velocidad=15;
		this.col= new ColDisparoAliado(this);
	}

	public void mover() {
		this.setPos(this.getPos().x+velocidad,this.getPos().y);
		if(this.getLabel().getLocation().x>1250)
			this.vida=0;
	}
	
	public void serColisionado(Colisionador col) {	}
	
	public void atacar(GameObject e) {
		e.disminuirVida(dano);	
		this.vida=0;
	}	

	@Override
	public void parar() {	}

	@Override
	public void morir() {	}

}
