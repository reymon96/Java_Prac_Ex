import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		
		RandomFig rndFig = new RandomFig();

		JFrame jfJframe  = new JFrame();

		jfJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfJframe.add(rndFig);
		jfJframe.setSize(300,300);
		jfJframe.setVisible(true);


	}

}