package Aliados;
import javax.swing.ImageIcon;
import Armas.ArmaHomero;
import Clases.Aliado;
import Clases.GameObject;

public class Homero extends Aliado {
	protected int contador;
	protected int danoArma;
	public Homero( int x, int y) {
		super(x,y);
		danoArma=400;
		dano=danoArma/4;
		vida=1100;
		precio=1500;
		monedas=precio;
		arma= new ArmaHomero();
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
		label.setBounds(x, y,117 , 110);
		contador=0;
	}
	
	public void atacarNormalGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartAtacaGif.gif")));
	}
	
	public void pararNormalGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
	}

	@Override
	public void mover() {	
//		estado.parar();
	}
	
	public void atacarSuperPoderosoGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartAtacaGif.gif")));
	}
	
	public void pararSuperPoderosoGrafico() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
	}

	@Override
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroAtacaGif.gif")));
		contador++;
		if(contador==20) {
			juego.agregarObjetos(arma.crearDisparo(this.getPos(), danoArma));
			contador=0;
		}
	}


}
