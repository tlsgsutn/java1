import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox [] fruits = new JCheckBox [3]; //üũ�ڽ� �迭
	private String [] names = {"���", "��", "ü��"}; // üũ�ڽ� ���ڿ��� ����� ���ڿ� �迭
	private JLabel sumLabe1; // ��� ���� ����� ���̺�
	
	public CheckBoxItemEventEx() {
		setTitle("üũ�ڽ��� ItemEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("��� 100��, �� 500��, ü�� 20000��"));
		
		// 3���� üũ�ڽ��� ����. ����Ʈ�ҿ� �����ϰ� Item ������ ���
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]); //names []�� ���ڿ��� üũ�ڽ� ����
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]); // ����Ʈ�ҿ� üũ�ڽ� ����
			fruits[i].addItemListener(listener); //üũ�ڽ��� Item ������ ���
		}
		
		sumLabe1 = new JLabel("���� 0�� �Դϴ�."); //���� ���� ����ϴ� ���̺� ����
		c.add(sumLabe1);
		
		setSize(250,200);
		setVisible(true);
		
		
	}
	
	// Item ������ ����
	class MyItemListener implements ItemListener {
		private int sum = 0; //������ ��
		
		//üũ�ڽ��� ���� ���°� ���ϸ� itemStateChanged()�� ȣ���
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) { //���� ���
				if(e.getItem() == fruits[0]) // ��� üũ�ڽ�
					sum += 100;
				else if(e.getItem() == fruits[1])//�� üũ�ڽ�
					sum += 500;
				else // ü�� üũ�ڽ�
					sum += 20000;
			}
			else { // ���� ���
				if(e.getItem() == fruits[0]) // ��� üũ�ڽ� 
					sum -= 100;
				else if(e.getItem() == fruits[1]) // �� üũ�ڽ�
					sum -= 500;
				else // ü�� üũ�ڽ�
					sum -= 20000;
			}
			sumLabe1.setText("���� "+ sum + "�� �Դϴ�."); // �� ���
		}
	}

	public static void main(String[] args) {
		new CheckBoxItemEventEx();
		// TODO Auto-generated method stub

	}

}
