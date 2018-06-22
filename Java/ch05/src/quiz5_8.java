import java.util.*;
public class quiz5_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5개 정수 입력");
		int a = sc.nextInt();
		if(a<1) {
			System.out.println("재입력.");
			a = sc.nextInt();
		}
		
		int b = sc.nextInt();
		if(b<1) {
			System.out.println("재입력.");
			b = sc.nextInt();
		}
		
		int c = sc.nextInt();
		if(c<1) {
			System.out.println("재입력.");
			c = sc.nextInt();
		}
		
		int d = sc.nextInt();
		if(d<1) {
			System.out.println("재입력.");
			d = sc.nextInt();
		}
		
		int e = sc.nextInt();
		if(e<1) {
			System.out.println("재입력.");
			e = sc.nextInt();
		}
		
		System.out.println("합 = " + (a+b+c+d+e));;
	}

}
