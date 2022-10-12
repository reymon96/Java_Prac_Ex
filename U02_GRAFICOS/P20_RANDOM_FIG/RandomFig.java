import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class RandomFig extends JPanel {

	public void paintComponent(Graphics grfG) {

		super.paintComponent(grfG);

		int intAncho = getWidth();
		int intLargo = getHeight();
		SecureRandom rdmNumero = new SecureRandom();

		for (int i = 0; i < 10; i++) {

			int intFig = rdmNumero.nextInt(2);
			Color colRandom = new Color(
			rdmNumero.nextInt(255), 
			rdmNumero.nextInt(255), 
			rdmNumero.nextInt(255));
			int intPunto01 = rdmNumero.nextInt(intAncho);
			int intPunto02 = rdmNumero.nextInt(intLargo);
			int intPunto03 = rdmNumero.nextInt(intAncho);
			int intPunto04 = rdmNumero.nextInt(intLargo);
			grfG.setColor(colRandom);

			if (intFig == 0) {
				//System.out.println("Rectangulo");
				grfG.fillRect(intPunto01, intPunto02, intPunto03, intPunto04);
			} else if (intFig == 1) {
				//System.out.println("Circulo");
				grfG.fillOval(intPunto01, intPunto02, intPunto03, intPunto04);
			}
		}

	}

}