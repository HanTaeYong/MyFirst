import java.util.*;
public class quiz5_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수 입력.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		
		System.out.print(a);
		if(a<b) {
			 for(int i=a+1; i<=b; i++)
			 	System.out.print(" + "+i);
		}else { 
			for(int i=a-1; i>=b; i--)
		 		System.out.print(" + "+i);
		}
	}
}
