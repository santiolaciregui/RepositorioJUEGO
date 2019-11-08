package Enemigos;

import javax.swing.ImageIcon;
import Clases.Enemigo;
import Clases.GameObject;
import Estados.Normal;

public class Flanders extends Enemigo  {

	public Flanders(int x, int y) {
		super(x, y);
		dano=30;
		vida=1100;
		monedas=700;
		puntosDeMuerte=1300;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersCaminaGif.gif")));
		label.setBounds(x, y,117 , 110);
		estado= new Normal(this);
	}
	
	public void mover() {
		super.mover();
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersCaminaGif.gif")));
	}
	public void atacar(GameObject e) {
		super.atacar(e);
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlandersAtacaGif.gif")));
	}
	
	public void parar() {
		super.parar();
	}

	@Override
	public Enemigo clonar() {
		Enemigo clone= new Flanders(0,0);
		setearValoresClone(clone);
		return clone;
	}

	@Override
	public void cambiarLabel() {	}	

}