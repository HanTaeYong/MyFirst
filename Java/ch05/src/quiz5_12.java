
public class quiz5_12 {
	public static void main(String[] args) {
		int i = 1;
		int sum = i ;
		
		System.out.print(i);
		do {
			i++;
			System.out.print(" + " + i);
			sum += i;
		}while(i<1000);
		
		System.out.print(" = " + sum);
	}
}
