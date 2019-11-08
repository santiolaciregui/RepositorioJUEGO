package Aliados;
import javax.swing.ImageIcon;
import Clases.Aliado;

public class Bart extends Aliado {

	public Bart(int x, int y) {
		super(x,y);
		dano=100;
		vida=800;
		precio=1000;
		monedas=precio;
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
		label.setBounds(x, y,117 , 110);
	}
	
	public void atacarNormal() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartAtacaGif.gif")));
	}
	
	public void pararNormal() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParado.png")));
	}

	@Override
	public void mover() {	
		estado.parar();
	}
	
	public void atacarSuperPoderoso() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartAtacaMejoradoGif.gif")));
	}
	
	public void pararSuperPoderoso() {
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/BartParadoMejorado.png")));
	}


}
