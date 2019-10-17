package Disparos;

import javax.swing.ImageIcon;

import Clases.GameObject;
import Colisionadores.ColDisparoAliado;
import Inteligencias.InteligenciaDisparoAliado;

public class DisparoAliado extends Disparo{

	public DisparoAliado(int damage, int x, int y) {
		super(damage, x, y);
		this.getLabel().setIcon(new ImageIcon(getClass().getResource("/Imagenes/BoloGif.gif")));
		this.col= new ColDisparoAliado(this);
		inteligencia= new InteligenciaDisparoAliado(this);
	}

	public void golpearEnemigo(GameObject e) {
		e.disminuirVida(dano);	
		this.vida=0;
	}
	
	public void mover() {
		inteligencia.mover();
		if(this.getLabel().getLocation().x>1250)
			this.vida=0;
	}
	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearJugador(GameObject j) {
		// TODO Auto-generated method stub
		
	}
}
