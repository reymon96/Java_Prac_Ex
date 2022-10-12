import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		
		Arcoiris objArcoiris = new Arcoiris();
		JFrame jfAplicacion = new JFrame();

		jfAplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfAplicacion.add(objArcoiris);
		jfAplicacion.setSize(300, 300);
		jfAplicacion.setVisible(true);

	}

}