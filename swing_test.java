import javax.swing.*;

class SwingDemo {
	SwingDemo() {
		JFrame jf = new JFrame("My frame");
		jf.setSize(300, 300);
		jf.setDefaultCloseCloseOperator(JFrame EXIT_ONCLOSE);
	}

	public static void main(String[] args) {
		SwingUtilities invokeLater(
			new Runnable() {
				public void run() {
					new SwingDemo();
				}
			}
		)
	}
}