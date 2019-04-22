import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 3개의 이미지를 파일로부터 읽어들인다.
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");
		
		// 3개의 이미지를 가진 버튼 생성
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
