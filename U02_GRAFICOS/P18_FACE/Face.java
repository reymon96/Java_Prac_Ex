import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class Face extends JPanel{

	public void paintComponent(Graphics grfG){

		super.paintComponent(grfG);

		grfG.setColor(Color.YELLOW);
		grfG.fillOval(10, 10, 200, 200);
		// dibuja los ojos
		grfG.setColor(Color.BLACK);
		grfG.fillOval(55, 65, 30, 30);
		grfG.fillOval(135, 65, 30, 30);
		// dibuja la boca
		grfG.fillOval(50, 110, 120, 60);
		// convierte la boca en una sonrisa
		grfG.setColor(Color.YELLOW);
		grfG.fillRect( 50, 110, 120, 30);
		grfG.fillOval(50, 120, 120, 40);

	}

}