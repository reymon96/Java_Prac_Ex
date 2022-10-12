import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		
		PanelDraw objPanelDraw = new PanelDraw();

		//Marco para el panel de dibujo;
		JFrame jfrAplicacion = new JFrame();

		jfrAplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrAplicacion.add(objPanelDraw);
		jfrAplicacion.setSize(250, 250);
		jfrAplicacion.setVisible(true);

	}

}