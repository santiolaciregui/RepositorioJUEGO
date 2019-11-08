package Aliados;
import java.awt.Point;
import javax.swing.ImageIcon;
import Armas.ArmaAbuelo;
import Clases.Aliado;
import Clases.GameObject;
import Colisionadores.ColAliado;

public class Abuelo extends Aliado {
	protected int contador;
	protected int danoArma;
	public Abuelo(int x, int y) {
		super(x,y);
		vida=2000;
		danoArma=500;
		dano=danoArma/4;
		precio=5000;
		monedas=precio;
		arma= new ArmaAbuelo();
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloParado.png")));
		label.setBounds(x, y,123 , 116);
		contador=0;
		col=new ColAliado(this);
	}
	
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloAtacaGif.gif")));
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloParado.png")));
	}
	
	public void disparar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloAtacaGif.gif")));
		contador++;
		if(contador==25) {
			Point pos= this.getPos();
			juego.agregarObjetos(arma.crearDisparo(pos, danoArma));
			pos.y-=90;
			juego.agregarObjetos(arma.crearDisparo(pos, danoArma));
			contador=0;
		}
	}

	@Override
	public void mover() {	
		disparar();
	}

	public void cambiarLabel() {
		if(dano>500)
			label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroAtacaMejoradoGif.gif")));
		else
			if(dano==400)
				label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroAtacaGif.gif")));
	}

}
