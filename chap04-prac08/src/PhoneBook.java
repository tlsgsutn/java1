import java.util.Scanner;

class Phone {
	private String name;
	private String tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
}

public class PhoneBook {
	private Scanner scanner;
	private Phone[] pArray;

	public PhoneBook() {
		scanner = new Scanner(System.in);
	}

	void read() {
		System.out.print("�ο���>>");
		int n = scanner.nextInt();
		
		pArray = new Phone [n]; // n ���� ������ �迭 ����
		for(int i=0; i<pArray.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = scanner.next();
			String tel = scanner.next();
			pArray[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
