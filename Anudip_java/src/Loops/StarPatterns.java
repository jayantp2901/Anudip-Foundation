package Loops;

public class StarPatterns {

	public static void main(String[] args) {
		starPattern1(); 
		System.out.println();
		
		starPattern2();
		System.out.println();

		starPattern3();
		System.out.println();

		starPattern4();
		System.out.println();

		starPattern5();
		System.out.println();
		
		starPattern6();
		System.out.println();
		
		starPattern7();
		System.out.println();

	}
	
	public static void starPattern1() {
		int i,j;
		for(i=1; i<=5; i++) {
			for(j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void starPattern2() {
		int i, j, k;
        int n = 5; 

        for (i = 1; i <= n; i++) {  
            for (j = n - i; j > 0; j--) { 
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {  
                System.out.print("*");
            }
            System.out.println(); 
        }
	}
	
	
	public static void starPattern3() {
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
	
	public static void starPattern4() {
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
	
	public static void starPattern5() {
		for(int i=0;i<5;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
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
	
	public static void starPattern6() {
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
	
	public static void starPattern7() {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			int ch = 65;

			for(int j=1; j<=i; j++) {
				System.out.print((char)(ch));
				ch++;
			}
			System.out.println();
		}
	}
	
}
