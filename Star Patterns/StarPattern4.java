package Loops;

public class StarPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			
			for(int s=1; s<i; s++) {
				System.out.print(" ");
			}
			
			if(i%2!=0) {
				for(int j=5; j>=i; j--) {
					if(j%2==0) {
						System.out.print("0");
					}else {
						System.out.print("1");
					}
				}
			}else {
				for(int j=5; j>=i; j--) {
					if(j%2==0) {
						System.out.print("1");
					}else {
						System.out.print("0");
					}
				}
			}
			
			System.out.println();
		}
	}

}
