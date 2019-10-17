package Clases;

import javax.swing.ImageIcon;

import Armas.Arma;
import Colisionadores.ColisionadorEnemigo;
import Inteligencias.InteligenciaEnemigo;
import Inteligencias.InteligenciaStatic;

public abstract class Enemigo extends GameObject{
	protected int monedas;
	protected int velocidad;
	protected int puntosDeMuerte;
	protected Arma arma;
	
	protected Enemigo(int x, int y) {
		super(x,y);
		inteligencia= new InteligenciaEnemigo(this);
		col= new ColisionadorEnemigo(this);
	}

	public void mover() {
		inteligencia.mover();
	}
	
	public void disminuirVida(int damage) {
		super.disminuirVida(damage);
		inteligencia.verificarInteligencia();
		if(vida==0) {
			juego.aumentarMonedas(damage);
			juego.aumentarPuntaje(puntosDeMuerte);
		}
	}

	@Override
	public void parar() {
		inteligencia=new InteligenciaStatic();
			
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearJugador(GameObject e) {
		e.disminuirVida(dano);
		this.vida=0;
		
	}

	@Override
	public void golpearEnemigo(GameObject e) {}

	
	public abstract Enemigo clonar();

}
