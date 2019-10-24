package Disparos;

import javax.swing.ImageIcon;
import Clases.GameObject;
import Colisionadores.ColDisparoAliado;
import Colisionadores.Colisionador;

public class DisparoAliado extends Disparo{
	public DisparoAliado(int damage, int x, int y) {
		super(damage, x, y);
		velocidad=20;
		this.getLabel().setIcon(new ImageIcon(getClass().getResource("/Imagenes/BoloGif.gif")));
		this.getLabel().setBounds(this.getPos().x, this.getPos().y, 15, 15);
		this.col= new ColDisparoAliado(this);
	}

	public void mover() {
		this.setPos(this.getPos().x+velocidad,this.getPos().y);
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
	
	public void golpearJugador(GameObject e) {
		this.vida=0;
	}

	@Override
	public void parar() {	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}

}
