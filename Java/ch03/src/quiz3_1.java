import java.util.Scanner;
public class quiz3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		System.out.println("���� �Է� a : ");
		a = sc.nextInt();
		System.out.println("���� �Է� b : ");
		b = sc.nextInt();
		
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
	}

}
