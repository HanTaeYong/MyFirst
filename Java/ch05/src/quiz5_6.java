import java.util.*;
public class quiz5_6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력.");
		int dan = sc.nextInt();
		
		for(int i=9; i>0; i--) 
			System.out.println(dan + " x " + i + " = " + dan*i);
		System.out.println();
	}
}
