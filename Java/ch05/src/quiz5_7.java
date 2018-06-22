import java.util.*;
public class quiz5_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국, 영, 수 점수 입력.");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		double avg = (kor + eng + mat) / 3;
		
		if(avg>=90)
			System.out.println("A");
		else if(avg>=80)
			System.out.println("B");
		else if(avg>=70)
			System.out.println("C");
		else if(avg>=50)
			System.out.println("D");
		else 
			System.out.println("F");
	}

}
