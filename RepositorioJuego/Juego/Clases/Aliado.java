package Clases;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.ImageIcon;

import Colisionadores.ColisionadorAliado;
import Colisionadores.ColisionadorEnemigo;
import Disparos.Disparo;
import Disparos.DisparoAliado;
import Visitadores.Visitor;

public abstract class Aliado extends GameObject {
	protected int monedas;

	protected Aliado(int x, int y) {
		super(x,y);	
		col= new ColisionadorAliado(this);
	}

	@Override
	public void atacar() {}

	@Override
	public void parar() {}

	@Override
	public void golpearJugador(GameObject j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearEnemigo(GameObject e) {
		// TODO Auto-generated method stub
		
	}
	
	public int getMonedas() {
		return monedas;
	}

	public void accept(Visitor v) {
		v.visitAliado(this);
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}
	
}
