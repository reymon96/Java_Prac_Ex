import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		
		Diana objDiana = new Diana();

		JFrame jfJframe  = new JFrame();

		jfJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfJframe.add(objDiana);
		jfJframe.setSize(300,300);
		jfJframe.setVisible(true);


	}

}