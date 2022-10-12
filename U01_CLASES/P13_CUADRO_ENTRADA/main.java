import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		String str_Nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");
		JOptionPane.showMessageDialog(null, "Hola " + str_Nombre + "!!!");
	}

}