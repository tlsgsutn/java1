import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//���ڿ� ���̺� ����
		JLabel textLabe1 = new JLabel("����մϴ�.");
		
		// �̹��� ���̺� ����
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");// �̹��� �ε�
		JLabel imageLabel = new JLabel(beauty); //�̹��� ���̺� ����
		
		//���ڿ��� �̹����� ��� ���� ���̺� ����
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif"); //�̹��� �ε�
		JLabel label = new JLabel("��������� ��ȭ�ϼ���",
				normalIcon, SwingConstants.CENTER); //���̺� ����
		
		//����Ʈ�ҿ� 3���� ���̺� ����
		c.add(textLabe1);
		c.add(imageLabel);
		c.add(label);
		
		setSize(400,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LabelEx();
		// TODO Auto-generated method stub

	}

}
