package PowerUps;

import javax.swing.ImageIcon;

public class Bomba extends PowerUp{

	public Bomba(int x, int y) {
		super(x,y);
		monedas=11;
		this.label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/IconoBomba.png")));
		label.setBounds(x, y, 130, 130);
		vida=100;
	}

	@Override
	public void realizarAccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}
}
