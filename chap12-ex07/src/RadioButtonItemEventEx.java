import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButtonItemEventEx extends JFrame {
	private JRadioButton [] radio = new JRadioButton [3]; //������ư �迭
	private String [] text = {"���", "��", "ü��"}; // ������ư�� ���ڿ�
    private ImageIcon [] image = { //�̹��� ��ü �迭
    		new ImageIcon("images/apple.jpg"),
    		new ImageIcon("images/pear.jpg"),
    		new ImageIcon("images/cherry.jpg")};
    private JLabel imageLabel = new JLabel(); // �̹����� ��µ� ���̺�
    
    public RadioButtonItemEventEx() {
    	setTitle("������ư Item Event ����");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
