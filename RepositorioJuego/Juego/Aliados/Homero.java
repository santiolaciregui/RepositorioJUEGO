package Aliados;
import javax.swing.ImageIcon;
import Armas.ArmaHomero;
import Clases.Aliado;

public class Homero extends Aliado {
	protected int contador;
	protected int danoArma;
	public Homero( int x, int y) {
		super(x,y);
		danoArma=400;
		dano=danoArma/4;
		vida=1100;
		precio=2500;
		monedas=precio;
		arma= new ArmaHomero();
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
		label.setBounds(x, y,117 , 110);
		contador=0;
	}
	
	public void atacarNormal() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroAtacaGif.gif")));
		disparar();
	}
	
	@Override
	public void mover() {	
		estado.atacar();
	}
	
	public void atacarSuperPoderoso() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroAtacaMejoradoGif.gif")));
		disparar();
	}
	
	public void disparar() {
		contador++;
		if(contador==50) {
			juego.agregarObjetos(arma.crearDisparo(this.getPos(), danoArma));
			contador=0;
		}
	}

	
	public void pararNormal() {	}
	public void pararSuperPoderoso() {	}

}
