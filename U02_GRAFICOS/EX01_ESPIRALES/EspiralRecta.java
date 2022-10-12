import javax.swing.JPanel;
import java.awt.Graphics;

public class EspiralRecta extends JPanel {

	public class paintComponent(Graphics grfG) {
		super.paintComponent(grfG);
		grfG.fillRect(0, 0, 0, 0);
	}

	public void EspiralRecta(){
		setBackground(Color.WHITE);

	}

}