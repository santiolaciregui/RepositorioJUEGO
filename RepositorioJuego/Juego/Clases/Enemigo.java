package Clases;

import javax.swing.ImageIcon;

import Colisionadores.ColisionadorEnemigo;
import Inteligencias.InteligenciaEnemigo;
import Inteligencias.InteligenciaStatic;
import Visitadores.Visitor;

public abstract class Enemigo extends GameObject{
	protected int monedas;
	protected int velocidad;
	
	protected Enemigo(int x, int y) {
		super(x,y);
		inteligencia= new InteligenciaEnemigo(this);
		vida=100;
		dano=10;
		puntosDeMuerte=100;
		col= new ColisionadorEnemigo(this);
	}

	public void mover() {
		inteligencia.mover();
	}
	
	public void disminuirVida(int damage) {
		super.disminuirVida(damage);
		inteligencia.verificarInteligencia();
//		if(vida==0)
//			PowerUp();
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
	
	public void accept(Visitor v) {
		v.visitEnemigo(this);
		
	}

	@Override
	public void accionar() {}	
	public abstract Enemigo clonar();

}
