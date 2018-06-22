
public class quiz5_5 {
	public static void main(String args[]) {
		
		for(int i=1; i<10; i++) {
			if(i%2==0) {
				for(int j=1; j<=i; j++) {
					System.out.println(i+" x "+j+" = "+(i*j));
				}
				System.out.println();
			}
		}
		/*
		int i=1, j=1;
		while(i<10) {
			j=1;
			if(i%2==0) {
				while(j<=i) {
					System.out.println(i+" x "+j+" = "+(i*j));
					j++;
				}
				System.out.println();
			}
			i++;
		}
		*/
	}
}
