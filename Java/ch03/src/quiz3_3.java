import java.util.Scanner;
public class quiz3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.println("�� ���� ������ �Է��ϼ���.");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a + " ������ " + b + " �� ���� " + (a/b) + " �Դϴ�.");
		System.out.println(a + " ������ " + b + " �� �������� " + (a%b) + " �Դϴ�.");
	}

}
