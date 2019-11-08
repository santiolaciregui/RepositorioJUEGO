package Aliados;
import javax.swing.ImageIcon;
import Armas.ArmaHomero;
import Clases.Aliado;
import Clases.GameObject;

public class Homero extends Aliado {
	protected int contador;
	public Homero( int x, int y) {
		super(x,y);
		dano=400;
		vida=1100;
		precio=1500;
		monedas=precio;
		arma= new ArmaHomero();
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
		label.setBounds(x, y,117 , 110);
		contador=0;
	}
	
	public void parar() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroParado.png")));
	}

	@Override
	public void mover() { atacar(null); }

	@Override
	public void atacar(GameObject e) {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/HomeroAtacaGif.gif")));
		contador++;
		if(contador==20) {
			juego.agregarObjetos(arma.crearDisparo(this.getPos(), dano));
			contador=0;
		}
		System.out.println(vida);
	}

	@Override
	public void cambiarLabel() {
		// TODO Auto-generated method stub
		
	}

}
