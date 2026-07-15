import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int sp= num-1;

        for(int i=1; i<=num; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");

            sp--;
            System.out.println();
        }
    }
}

/*

Enter a number: 4
                        *
                *
        *
*

 */

/*
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
            if(i+j==n+1){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
            }
            System.out.println();
        }
    }
 */