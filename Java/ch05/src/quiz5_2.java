import java.util.*;
public class quiz5_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 갯수 : ");
		int tc = sc.nextInt();
		
		double sum = 0;
		for(int i=1; i<=tc; i++) {
			System.out.println(i + "번째 정수 입력 : ");
			int num=sc.nextInt();
			sum += num;
		}
		System.out.println("평균 : " + sum/tc);
	}

}
