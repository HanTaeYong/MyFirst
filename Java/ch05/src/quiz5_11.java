import java.util.*;
public class quiz5_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력.");
		int n = sc.nextInt();
		int mul = n;
		
		System.out.print(n);
		for(int i=n-1; i>0; i--) {
			System.out.print(" * " + i);
			mul *= i;
		}
		System.out.println(" = " + mul);
	}
}
