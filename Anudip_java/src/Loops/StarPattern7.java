package Loops;

public class StarPattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			int ch = 65;
		
			for(int k=1; k<i; k++) {
				System.out.print(" ");
			}

			for(int j=5; j>=i; j--) {
				System.out.print((char)(ch));
				ch++;
			}
			System.out.println();
		}
	}

}
