package Clases;

import Armas.Arma;
import Colisionadores.Colisionador;
import Colisionadores.ColisionadorEnemigo;

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
		atacar(null);
	}
	
	public void disminuirVida(int damage) {
		super.disminuirVida(damage);
		if(vida==0) {
			juego.aumentarMonedas(damage);
			juego.aumentarPuntaje(puntosDeMuerte);
			//largar PowerUp //faltaaaa
		}
	}

	@Override
	public void atacar(GameObject e) {
	}

	public void serColisionado(Colisionador col) {
		col.visitar(this);
	}
	
	@Override
	public void golpearAliado(GameObject e) {
		e.disminuirVida(dano);
		this.vida=0;
		
	}

	@Override
	public void golpearEnemigo(GameObject e) {}

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
