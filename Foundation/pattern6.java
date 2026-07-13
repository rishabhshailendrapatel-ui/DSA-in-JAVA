import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int sp= 1;
        int st= (num/2)+1;

        for(int i=1; i<=num; i++){
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }
            for(int k=1; k<=sp; k++){
                System.out.print("\t");
            }
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }

            if(i<=num/2){
                st--;
                sp+=2;
            }
            else {
                st++;
                sp-=2;
            }
            System.out.println();
        }
    }
}

/*

Enter a number: 5
*       *       *               *       *       *
*       *                               *       *
*                                               *
*       *                               *       *
*       *       *               *       *       *

 */