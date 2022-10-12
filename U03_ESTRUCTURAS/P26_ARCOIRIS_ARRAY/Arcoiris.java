import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Arcoiris extends JPanel {

	// Define los colores índigo y violeta
	private final static Color VIOLETA = new Color(128, 0, 128);
	private final static Color INDIGO = new Color(75, 0, 130);

	private Color[] colores = { 
		Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.BLUE,
		Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED 
	};

	public Arcoiris() {
		setBackground(Color.WHITE);
	}



	public void paintComponent(Graphics grfG){
		
		super.paintComponent(grfG);
		
		int intRadio = 20;
		int intCentroX = getWidth() / 2;
		int intCentroY = getHeight() - 10;

		for (int contador = colores.length; contador > 0; contador--) {
			grfG.setColor(colores[contador - 1]);
			// rellena el arco desde 0 hasta 180 grados
			grfG.fillArc(
				intCentroX - contador * intRadio, 
				intCentroY- contador * intRadio, 
				contador * intRadio * 2, 
				contador * intRadio * 2, 0, 180);
		}

	}

}