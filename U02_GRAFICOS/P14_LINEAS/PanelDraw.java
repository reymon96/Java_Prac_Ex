import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDraw extends JPanel{

	public void paintComponent(Graphics grfG){
		
		super.paintComponent(grfG); //Llama a todos los componentes del paintComponent;

		int intAncho = getWidth();
		int intAltura = getHeight();

		//Dibuja la linea SupIzq a InfDer;
		grfG.drawLine(0, 0, intAncho, intAltura);

		//Dibuja la linea SupDer a InfIzq;
		grfG.drawLine(0, intAltura, intAncho, 0);

	}

}
