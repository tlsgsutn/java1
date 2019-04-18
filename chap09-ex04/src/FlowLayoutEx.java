import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(30,20));
		c.add(new JButton("Calculate"), BorderLayout.NORTH);
		c.add(new JButton("add"),BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("sub"), BorderLayout.WEST);
		
		setSize(300,200); //������ ũ�� 300x200 ����
		setVisible(true); //�������� ȭ�鿡 ���
	}

	public static void main(String[] args) {
		new BorderLayoutEx();

	}
}
