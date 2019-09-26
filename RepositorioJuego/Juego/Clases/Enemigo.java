package Clases;

import javax.swing.ImageIcon;

import Inteligencias.InteligenciaEnemigo;

public class Enemigo extends GameObject{
	protected int monedas;
	protected int velocidad;
	
	public Enemigo(int x, int y) {
		super(x,y);
//		inteligencia= new InteligenciaEnemigo(this);
		vida=100;
		dano=10;
		setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersAtacaGif.gif")));
		puntosDeMuerte=100;
		
		
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		inteligencia.mover();
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}

}
