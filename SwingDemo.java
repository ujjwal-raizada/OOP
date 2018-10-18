import javax.swing.*;
import java.awt.*;

class SwingDemo {
	SwingDemo() {
		JFrame jf = new JFrame("My frame");
		jf.setSize(300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jl1 = new JLabel("Kroot");
		JLabel jl2 = new JLabel("Patel");
		jf.add(jl1, BorderLayout.EAST);
		jf.add(jl2, BorderLayout.WEST);


		jf.setVisible(true);
	}
}

class Hi {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					new SwingDemo();
				}
			}
		);
	}
}