import java.util.*;
public class quiz5_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �� �Է�.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b)
			System.out.println("�� : " + (a-b));
		else
			System.out.println("�� : " + (b-a));
	}
}