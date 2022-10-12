import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDraw extends JPanel{

	public void paintComponent(Graphics grfG){
		
		super.paintComponent(grfG); //Llama a todos los componentes del paintComponent;

		int intAncho = getWidth();
		int intAltura = getHeight();

		int intCantidadLienas = 30;
		int intUnidad = (intAncho/intCantidadLienas); // Unidad de medida de la matriz;

		for (int i = 0; i < intCantidadLienas; i++) {
			grfG.drawLine(0, 
				(intUnidad * i), 
				(intUnidad * (i + 1)), 
				intAltura);

			grfG.drawLine(
				(intUnidad * (i + 1)), 
				intAltura, 
				intAncho, 
				(intAltura - (intUnidad * (i + 1))));

			grfG.drawLine(
				(intUnidad * i), 
				0, 
				intAncho, 
				(intUnidad * (i + 1)));

			grfG.drawLine(
				0, 
				(intAltura - (intUnidad * i)), 
				(intUnidad * (i + 1)), 
				0);
		}

	}

}
