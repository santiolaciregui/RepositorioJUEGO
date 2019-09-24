package Clases;

import Inteligencias.InteligenciaEnemigo;

public class Enemigo extends GameObject{
	protected int monedas;
	protected int velocidad;
	
	public Enemigo(int x, int y) {
		super(x,y);
		inteligencia= new InteligenciaEnemigo(this);
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}

}
