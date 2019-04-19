import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseWheelFrame extends JFrame {
	public MouseWheelFrame() {
		super("마우스 휠을 굴려 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love java");
		c.add(label);
		
		label.setFont(new Font("Arial", Font.PLAIN, 15)); //15 픽셀 크기
		
		label.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				if(n < 0) { // down direction. 폰트 크게
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					la.setFont(new Font("Arial", Font.PLAIN, size-5));
				}
				else { // down direction. 폰트 크게
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("TimesRoman", Font.PLAIN, size+5));
					}
				}
		});
		setSize(300,150);
		setVisible(true);
	}

	static public void main(String[] args) {
		new MouseWheelFrame();
		// TODO Auto-generated method stub

	}

}
