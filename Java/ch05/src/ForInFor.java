
public class ForInFor {

	public static void main(String[] args) {
		/*
		for(int i=0; i<3; i++) {
			System.out.println("------------------");
			for(int j=0; j<3; j++) {
				System.out.print("[" + i + "," + j + "] ");
			}
			System.out.println();
		}*/
		/*
		for(int i=1; i<10; j++) {
			for(int j=1; j<10; i++) {
				System.out.print(j + " x " + i + " = " + i*j + '\t');
			}
			System.out.println();
		}*/
		int i = 1, j = 1;
		while(i<10) {
			j=1;
			while(j<10) {
				System.out.print(j + " x " + i + " = " + i*j + '\t');
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
