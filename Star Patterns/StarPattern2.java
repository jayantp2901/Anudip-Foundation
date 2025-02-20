package Loops;

//     *
//    **
//   ***
//  ****
// *****



public class StarPattern2 {
    public static void main(String[] args) {
        int i, j, space;
        int n = 5; 

        for (i = 1; i <= n; i++) {  
            for (space = n - i; space > 0; space--) { 
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {  
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}

