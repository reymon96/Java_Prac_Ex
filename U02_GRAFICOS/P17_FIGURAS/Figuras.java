import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class Figuras extends JPanel {

	private int _intOpcion;

	public Figuras(int intOpcionUsuario){
		this._intOpcion = intOpcionUsuario;
	}

	public void paintComponent(Graphics grfG){
		
		super.paintComponent(grfG);
		int intAncho = getWidth();
		int intAltura = getHeight();

		for (int i = 0; i < 20; i++) {
			
			switch (_intOpcion){
				
				case 1:
					//Rectangulos;
					grfG.drawRect( 10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
					break;

				case 2:
					//Circulos;
					grfG.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
					break;

				case 3:
					//Espiral
					grfG.drawOval((i*10), (i*10), (intAncho - (i*20)), (intAltura - (i*20)));
					break;
			}

		}

	}

}