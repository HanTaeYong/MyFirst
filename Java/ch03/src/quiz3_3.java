import java.util.Scanner;
public class quiz3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.println("두 개의 정수를 입력하세요.");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a + " 나누기 " + b + " 의 몫은 " + (a/b) + " 입니다.");
		System.out.println(a + " 나누기 " + b + " 의 나머지는 " + (a%b) + " 입니다.");
	}

}
