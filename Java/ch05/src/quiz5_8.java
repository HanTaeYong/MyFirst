import java.util.*;
public class quiz5_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("5개 정수 입력");
		for(int i=0; i<5; i++) {
			num = sc.nextInt();
			if(num<1) {
				System.out.println("재입력");
				i--;
				continue;
			}
			sum+=num;
		}
		System.out.println("합 = " + sum);;
	}
}
