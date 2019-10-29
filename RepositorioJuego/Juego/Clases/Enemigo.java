package Clases;

import Armas.Arma;
import Colisionadores.Colisionador;
import PowerUpss.MagiaTemporal;
import Colisionadores.ColEnemigo;

public abstract class Enemigo extends GameObject{
	protected int monedas;
	protected int velocidad;
	protected int puntosDeMuerte;
	protected Arma arma;
	
	protected Enemigo(int x,int y) {
		super(x,y);
		col= new ColEnemigo(this);
		velocidad=1;
	}

	public void mover() {
		this.setPos(this.getPos().x - velocidad, this.getPos().y);
		if(this.getPos().x<-10) {
			this.setVida(0);
			juego.disminuirVida(1);
		}
	}
	
	@Override
	public void disminuirVida(int damage) {
		super.disminuirVida(damage);
		if(vida==0) {
			juego.aumentarMonedas(damage);
			juego.aumentarPuntaje(puntosDeMuerte);
			lanzarPowerUp();
		}
	}

	@Override
	public void atacar(GameObject e) {
		
	}
	
	protected void lanzarPowerUp() {
//		int n= (int) (Math.random() * 4) + 1;
		PowerUp powerup=null;
//		switch(n) {
//		CASE 1: 
			powerup= new MagiaTemporal(this.getPos().x,this.getPos().y);
//			breAK;
//		}
//		IF(POWERUP!=NULL) {
			juego.agregarObjetos(powerup);
//		}
	}

	public void serColisionado(Colisionador col) {
		col.visitar(this);
	}
	
	public void golpearPowerUp(GameObject e) {
	}

	public void golpearObstaculoBarricada(GameObject o) {
	}

	public void golpearDisparoJugador(GameObject d) {
	}

	public void golpearDisparoEnemigo(GameObject d) {
	}
	
	public abstract Enemigo clonar();

}
