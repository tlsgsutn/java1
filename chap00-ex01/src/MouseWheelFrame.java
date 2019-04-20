import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MouseWheelFrame extends JFrame {
	public MouseWheelFrame() {
		super("제목 없음 - 메모장");
		setSize(1000, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("파일(F)");
		JMenu editMenu = new JMenu("편집(E)");
		JMenu formMenu = new JMenu("서식(O)");
		JMenu exampleMenu = new JMenu("보기(V)");
		JMenu adviceMenu = new JMenu("도움말(H)");

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
