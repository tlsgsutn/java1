import java.util.Scanner;

public class Rectangle {
	int width;
	int height;

	public Rectangle() {

	}

	public int getArea() {
		return width * height;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(); // 객체
		Scanner scan = new Scanner(System.in); // 키보드 입력
		System.out.print("입력");

		rect.width = scan.nextInt();
		rect.height = scan.nextInt();

		System.out.println("사각형의 면적" + rect.getArea());
		
		scan.close();

	}

}
