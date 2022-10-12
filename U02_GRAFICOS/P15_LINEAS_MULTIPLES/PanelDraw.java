import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDraw extends JPanel{

	public void paintComponent(Graphics grfG){
		
		super.paintComponent(grfG); //Llama a todos los componentes del paintComponent;

		int intAncho = getWidth();
		int intAltura = getHeight();

		int intCantidadLienas = 20;
		int intUnidad = (intAncho/intCantidadLienas); // Unidad de medida de la matriz;

		/* //Lineas en cuadricula;
		for (int i = 0; i < intCantidadLienas; i++) {
			grfG.drawLine(
				0,
				intUnidad * (i+1),
				intAncho,
				intUnidad * (i+1));

			grfG.drawLine(
				intUnidad * (i+1),
				0,
				intUnidad * (i+1),
				intAltura);
		} */

		
		for (int i = 0; i < intCantidadLienas; i++) {
			//Superior Izquierda;
			grfG.drawLine(
				0, 
				0, 
				(intAncho - (intUnidad * (i + 1))), 
				(intUnidad * (i + 1)));
			//Inferior Izquierda;
			grfG.drawLine(
				0, 
				intAltura, 
				(intUnidad * (i + 1)), 
				(intUnidad * (i + 1)));
			//Superior Derecha;
			grfG.drawLine(
				intAncho, 
				0, 
				(intUnidad * (i + 1)), 
				(intUnidad * (i + 1)));
			//Inferior Derecha;
			grfG.drawLine(
				(intAncho - intUnidad * (i + 1)),
				(intUnidad * (i + 1)),
				intAncho,
				intAltura);
		}

	}

}