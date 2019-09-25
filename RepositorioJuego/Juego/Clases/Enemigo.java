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
