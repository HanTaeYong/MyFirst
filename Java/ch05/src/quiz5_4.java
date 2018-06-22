import java.util.*;
public class quiz5_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수 입력.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b)
			System.out.println("차 : " + (a-b));
		else
			System.out.println("차 : " + (b-a));
	}
}
