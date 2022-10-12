import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		int intOpcion = Integer.parseInt(
			JOptionPane.showInputDialog(
				"Figuras:\n1 - Rectangulo.\n2 - Circulos.\n3 - Uzumaki.\nIngrese una opción:"
				));
		
		Figuras objFigurasDraw = new Figuras(intOpcion);

		JFrame jfAplicacion = new JFrame();
		jfAplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfAplicacion.add(objFigurasDraw);
		jfAplicacion.setSize(500, 500);
		jfAplicacion.setVisible(true);

	}

}