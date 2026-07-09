import  java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int sp= num-1;  //sp stands for Space
        int st= 1;  //st stands for Star

        for(int i=1; i<=num; i++){

            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int k=1; k<=st; k++){
                System.out.print("*\t");
            }
            
            sp--;
            st++;
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