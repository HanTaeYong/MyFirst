import java.util.*;
public class quiz5_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� : ");
		int cnt = sc.nextInt();
		
		double sum = 0;
		for(int i=1; i<=cnt; i++) {
			System.out.println(i + "��° ���� �Է� : ");
			int num=sc.nextInt();
			sum += num;
		}
		System.out.println("��� : " + sum/cnt);
	}

}