import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Demo {

	JLabel jl;
	Demo() {
		JFrame jf = new JFrame("Heelo");
		jf.setLayout(new FlowLayout());
		jf.setSize(300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton jb1 = new JButton("One");
		JButton jb2 = new JButton("Two");
		jf.add(jb1);
		jf.add(jb2);
		

		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jl.setText("Button One Pressed");
			}
		});

		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jl.setText("Button Two Pressed");
			}
		});
		jl = new JLabel("Press button");
		jf.add(jl);
		jf.setVisible(true);	
	}


}



class Hi {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					new Demo();
				}
			}
		);
	}
}