package Clases;

import javax.swing.ImageIcon;

import Inteligencias.InteligenciaEnemigo;
import Visitadores.Visitor;

public class Enemigo extends GameObject{
	protected int monedas;
	protected int velocidad;
	
	public Enemigo(int x, int y) {
		super(x,y);
		inteligencia= new InteligenciaEnemigo(this);
		vida=100;
		dano=10;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersCaminaGif.gif")));
		puntosDeMuerte=100;
		
	}

	public void mover1() {
		inteligencia.mover();
	}
	
	public void mover(int velocidad) {
		this.setPos(this.getPos().x-velocidad, this.getPos().y);
	}
	
	public void disminuirVida(int damage) {
		super.disminuirVida(damage);
		inteligencia.verificarInteligencia();
//		if(vida==0)
//			PowerUp();
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
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
	public void golpearEnemigo(GameObject e) {
		// TODO Auto-generated method stub
		
	}
	
	

	
	public void accept(Visitor v) {
		v.visitEnemigo(this);
		
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

}
