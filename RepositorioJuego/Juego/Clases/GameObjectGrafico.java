package Clases;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GameObjectGrafico {
	protected JLabel label;
	public GameObjectGrafico(int x, int y) {
		label= new JLabel();
		Rectangle aux= label.getBounds();
		label.setLocation(x, y);
	}
	
	public JLabel getLabel() {
		return label;
	}
	
	public void setPosicion(int x, int y) {
		Rectangle aux= label.getBounds();
		label.setBounds(x,y, aux.width, aux.height);
	}
	
	public void atacarGrafico() {}
	public void pararGrafico() {}
	
	
}
