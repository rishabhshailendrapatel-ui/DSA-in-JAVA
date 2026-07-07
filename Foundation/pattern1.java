import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){                    // <-- magic
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}


/*

Enter a number: 5
*
*       *
*       *       *
*       *       *       *
*       *       *       *       *

*/