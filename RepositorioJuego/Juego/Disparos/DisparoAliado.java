package Disparos;

import javax.swing.ImageIcon;
import Clases.GameObject;
import Clases.Juego;
import Colisionadores.ColDisparoAliado;
import Colisionadores.Colisionador;

public class DisparoAliado extends Disparo{
	public DisparoAliado(Juego game, int damage, int x, int y) {
		super(game,damage, x, y);
		velocidad=2;
		this.getLabel().setIcon(new ImageIcon(getClass().getResource("/Imagenes/BoloGif.gif")));
		this.col= new ColDisparoAliado(this);
//		mover();
	}

	public void golpearEnemigo(GameObject e) {
		e.disminuirVida(dano);	
		this.vida=0;
	}
	
	public void mover() {
		this.setPos(this.getPos().x+velocidad,this.getPos().y);
		if(this.getLabel().getLocation().x>1250)
			this.vida=0;
	}
	
	
	public void golpearJugador(GameObject e) {
		this.vida=0;
	}
	
	public void golpearDisparoJugador(GameObject d) {}
	
	@Override
	public void atacar(GameObject e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearAliado(GameObject j) {
		// TODO Auto-generated method stub
		
	}
}
