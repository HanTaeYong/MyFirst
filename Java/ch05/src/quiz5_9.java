
public class quiz5_9 {
	public static void main(String[] args) {
		int i=1, sum=0;
		do {
			if(i%2==0)
				sum+=i;
			i++;
		}while(i<=100);
		System.out.println(sum);
	}
}
