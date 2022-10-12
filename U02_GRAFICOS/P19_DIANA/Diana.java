import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class Diana extends JPanel{

	public void paintComponent(Graphics grfG){

		super.paintComponent(grfG);
		
		SecureRandom random = new SecureRandom();
		
		int intAncho = getWidth();
		int intAltura = getHeight();

		for (int i = 0; i < 5; i++) {
			
			Color colRandom = new Color(
			random.nextInt(255), 
			random.nextInt(255), 
			random.nextInt(255));

			grfG.setColor(colRandom);
			grfG.fillOval(
				(i * 30), 
				(i * 30), 
				(intAncho - (i * 60)), 
				(intAltura - (i * 60)));

		}

	}

}