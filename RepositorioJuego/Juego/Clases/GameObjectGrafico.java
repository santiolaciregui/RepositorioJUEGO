package Clases;

import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GameObjectGrafico extends JLabel {
	public GameObjectGrafico(int x, int y) {
		setBounds(x,y);
	}
	
	public void setImage(String img) {
		setIcon(new ImageIcon(getClass().getResource(img)));
	}
	

	public void setBounds(int x, int y) {
		Rectangle aux= this.getBounds();
		setBounds(x,y, aux.width, aux.height);
	}
}
