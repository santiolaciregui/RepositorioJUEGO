package Clases;

import java.util.Random;

import Armas.Arma;
import Colisionadores.Colisionador;
import Colisionadores.ColisionadorEnemigo;
import PowerUps.MagiaTemporal;
import PowerUps.PowerUp;

public abstract class Enemigo extends GameObject{
	protected int monedas;
	protected int velocidad;
	protected int puntosDeMuerte;
	protected Arma arma;
	
	protected Enemigo(int x,int y) {
		super(x,y);
		col= new ColisionadorEnemigo(this);
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
	public void parar() {
		this.setPos(this.getPos().x, this.getPos().y);
	}
	
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
		parar();
		velocidad=0;
	}
	
	protected void lanzarPowerUp() {
		int n= 1;
		PowerUp powerup=null;
		switch(n) {
		case 1: 
			powerup= new MagiaTemporal(this.getPos().x,this.getPos().y);
			break;
		}
		if(powerup!=null) {
			juego.agregarDisparo(powerup);
		}
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
