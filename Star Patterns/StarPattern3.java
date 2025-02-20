package Loops;

//1
//10
//101
//1010
//10101


public class StarPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				if(j%2==0) {
					System.out.print("0");
				}else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}

}
