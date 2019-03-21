
public class CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] c; // 배열의 래퍼런스
		c = new Circle[5]; // 5개 공간 생성

		for (int i = 0; i < c.length; i++)
			c[i] = new Circle(i);

		for (int i = 0; i < c.length; i++)
			System.out.print((int) (c[i].getArea()) + " ");

	}

}
