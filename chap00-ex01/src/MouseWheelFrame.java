import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MouseWheelFrame extends JFrame {
	public MouseWheelFrame() {
		super("���� ���� - �޸���");
		setSize(1000, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("����(F)");
		JMenu editMenu = new JMenu("����(E)");
		JMenu formMenu = new JMenu("����(O)");
		JMenu exampleMenu = new JMenu("����(V)");
		JMenu adviceMenu = new JMenu("����(H)");

		mb.add(fileMenu);
		mb.add(editMenu);
		mb.add(formMenu);
		mb.add(exampleMenu);
		mb.add(adviceMenu);
		setJMenuBar(mb);
		
		
	}

	
	public static void main(String[] args) {
		new MouseWheelFrame();
		// TODO Auto-generated method stub

	}

}
