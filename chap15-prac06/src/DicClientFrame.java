import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DicClientFrame extends JFrame {
	private Socket socket = null;
	private JTextField eng = new JTextField(10);
	private JTextField kor = new JTextField(10);
	private JButton searchBtn = new JButton("ã��");

	BufferedReader in = null;
	BufferedWriter out = null;

	public DicClientFrame() {
		super("Ŭ���̾�Ʈ"); // ������ Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ ���� ��ư(x)�� Ŭ���ϸ�
														// ���α׷� ����

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("����"));
		c.add(eng);
		c.add(new JLabel("�ѱ�"));
		c.add(kor);
		c.add(searchBtn);
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
		}
		searchBtn.addActionListener(new MyActionListener());

		setSize(400, 120);
		setVisible(true);
	}

	private void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}

	private void setupConnection() throws IOException {
		socket = new Socket("localhost", 9998); // Ŭ���̾�Ʈ ���� ����
		System.out.println("�����");
		in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Ŭ���̾�Ʈ�κ�����
																					// �Է�
																					// ��Ʈ��
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // Ŭ���̾�Ʈ����
																					// ���
																					// ��Ʈ��
	}

	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				out.write(eng.getText() + "\n");
				out.flush();
				String text = in.readLine();
				kor.setText(text);
			} catch (IOException e2) {
				handleError(e2.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		new DicClientFrame();

	}

}
