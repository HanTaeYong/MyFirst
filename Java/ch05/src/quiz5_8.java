import java.util.*;
public class quiz5_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5�� ���� �Է�");
		int a = sc.nextInt();
		if(a<1) {
			System.out.println("���Է�.");
			a = sc.nextInt();
		}
		
		int b = sc.nextInt();
		if(b<1) {
			System.out.println("���Է�.");
			b = sc.nextInt();
		}
		
		int c = sc.nextInt();
		if(c<1) {
			System.out.println("���Է�.");
			c = sc.nextInt();
		}
		
		int d = sc.nextInt();
		if(d<1) {
			System.out.println("���Է�.");
			d = sc.nextInt();
		}
		
		int e = sc.nextInt();
		if(e<1) {
			System.out.println("���Է�.");
			e = sc.nextInt();
		}
		
		System.out.println("�� = " + (a+b+c+d+e));;
	}

}
