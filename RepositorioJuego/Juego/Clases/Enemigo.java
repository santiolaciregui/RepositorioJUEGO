package Clases;

import java.util.Random;

import Armas.Arma;
import Colisionadores.Colisionador;
import PowerUps.Congelar;
import PowerUps.Curacion;
import PowerUps.MegaFuerza;
import Colisionadores.ColEnemigo;

public abstract class Enemigo extends GameObject implements Cloneable{
	protected int monedas;
	protected int velocidad;


	protected int puntosDeMuerte;
	protected Arma arma;
	
	protected Enemigo(int x,int y) {
		super(x,y);
		col= new ColEnemigo(this);
		velocidad=3;
	}

	
	public void mover() {
		this.setPos(this.getPos().x - velocidad, this.getPos().y);
		if(this.getPos().x<-10) {
			this.setVida(0);
			juego.disminuirVida(1);
		}
	}
	
	public void parar() {
		this.setPos(this.getPos().x,  this.getPos().y);
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
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
	public void atacar(GameObject e) {	}
	
	protected void lanzarPowerUp() {
<<<<<<< HEAD
=======

>>>>>>> 2e3643d6bcbde6254a67e28e258f0c581751e6e6
		Random numAleatorio = new Random();
		int n = numAleatorio.nextInt(8-1+1) + 1;
		PowerUp powerup=null;
		switch(n) {
			case 1: 
				powerup= new Curacion(this.getPos().x,this.getPos().y);
				break;
			case 2:
				powerup= new Congelar(this.getPos().x,this.getPos().y);
				break;
			case 3:
				powerup= new MegaFuerza(this.getPos().x,this.getPos().y);
				break;
				
		}
<<<<<<< HEAD
		if(powerup!=null) {
			juego.agregarObjetos(powerup);
		}
=======
		if(powerup!=null) 
			juego.agregarObjetos(powerup);
>>>>>>> 2e3643d6bcbde6254a67e28e258f0c581751e6e6
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
	
	public abstract Enemigo crear();

}
