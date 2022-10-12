import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		
		Face objHappyFace = new Face();
		JFrame jfJframe  = new JFrame();

		jfJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfJframe.add(objHappyFace);
		jfJframe.setSize(300,300);
		jfJframe.setVisible(true);

	}

}