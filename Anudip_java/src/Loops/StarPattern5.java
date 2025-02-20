package Loops;

//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *


public class StarPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pyramid
		for(int i=0;i<5;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//inverse pyramid
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=9;k>=2*i+1;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
