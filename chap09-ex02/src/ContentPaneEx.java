import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("Content Pane and JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container container = getContentPane();
		container.setBackground(Color.RED);
		container.setLayout(new FlowLayout());

		container.add(new JButton("OK"));
		container.add(new JButton("CANCEL"));
		container.add(new JButton("IGNORE"));
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}