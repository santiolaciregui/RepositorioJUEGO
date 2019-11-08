package Aliados;
import java.awt.Point;
import javax.swing.ImageIcon;
import Armas.ArmaAbuelo;
import Clases.Aliado;

public class Abuelo extends Aliado {
	protected int contador;
	protected int danoArma;
	public Abuelo(int x, int y) {
		super(x,y);
		vida=200000;
		danoArma=500;
		dano=danoArma/4;
		precio=5000;
		monedas=precio;
		arma= new ArmaAbuelo();
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloParado.png")));
		label.setBounds(x, y,123 , 116);
		contador=0;
	}
	
	public void atacarNormal() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloAtacaGif.gif")));
		disparar();
	}
	
	public void atacarSuperPoderoso() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/AbueloAtacaMejoradoGif.gif")));
		disparar();
	}
	
	public void disparar() {
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
		estado.atacar();
	}

	public void pararNormal() {		}
	public void pararSuperPoderoso() {	}
	
}
