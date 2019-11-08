package Clases;

import java.util.Random;
import Armas.Arma;
import Colisionadores.Visitor;
import Estados.EnemigoNormal;
import Estados.EnemigoSuperPoderoso;
import Estados.Estado;
import PowerUps.Congelar;
import PowerUps.Curacion;
import PowerUps.MegaFuerza;
import PowerUps.PowerBomba;
import Colisionadores.ColEnemigo;

public abstract class Enemigo extends GameObject implements Clonacion<Enemigo>{
	protected int monedas;
	protected int velocidad;
	protected int puntosDeMuerte;
	protected Arma arma;
	protected Estado estado;

	protected Enemigo(int x,int y) {
		super(x,y);
		col= new ColEnemigo(this);
		velocidad=2;
	}

	public void atacar(GameObject e) {
		e.disminuirVida(dano);
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
	
	public int getVelocidad() {
		return velocidad;
	}
	public void reducirVida(int dano) {
		vida-=dano;
		if(vida<=0) {
			juego.aumentarMonedas(dano);
			lanzarPowerUp();
		}
	}
	public void disminuirVida(int damage) {
		estado.disminuirVida(damage);
	}
	
	protected void lanzarPowerUp() {
		Random numAleatorio = new Random();
		int n = numAleatorio.nextInt(10) + 1;
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
			case 4:
				powerup= new PowerBomba(this.getPos().x,this.getPos().y);
				break;
				
		}
		if(powerup!=null) {
			juego.agregarObjetos(powerup);
		}
	}

	public void serColisionado(Visitor col) {
		col.visitar(this);
	}

	public void setEstado(Estado est) {
		estado=est;
		
	}	
	
	protected void enemigoAleatorio() {
		Random numAleatorio = new Random();
		int n = numAleatorio.nextInt(5);
		if(n==0) {
			this.setEstado(new EnemigoSuperPoderoso(this));
			this.vida=3000;
		}
		else {
			this.setEstado(new EnemigoNormal(this));
			this.vida=2000;
		}
	}
	
	protected void setearValoresClone(Enemigo e) {
		e.setVida(this.getVida());
		e.setDano(this.getDano());
		e.setJuego(this.getJuego());
		e.setVelocidad(e.velocidad);
		e.setLabel(this.getLabel());
		e.setCol(new ColEnemigo(e));
		e.monedas=this.monedas;
		e.arma=this.arma;
		e.setLabel(this.getLabel());
	}
	
	
	public abstract Enemigo clonar();
	public abstract void cambiarLabel();
	
	

}
