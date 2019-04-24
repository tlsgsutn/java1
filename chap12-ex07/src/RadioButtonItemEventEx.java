import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButtonItemEventEx extends JFrame {
	private JRadioButton [] radio = new JRadioButton [3]; //라디오버튼 배열
	private String [] text = {"사과", "배", "체리"}; // 라디오버튼의 문자열
    private ImageIcon [] image = { //이미지 객체 배열
    		new ImageIcon("images/apple.jpg"),
    		new ImageIcon("images/pear.jpg"),
    		new ImageIcon("images/cherry.jpg")};
    private JLabel imageLabel = new JLabel(); // 이미지가 출력될 레이블
    
    public RadioButtonItemEventEx() {
    	setTitle("라디오버튼 Item Event 예제");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
