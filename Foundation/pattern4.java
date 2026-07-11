import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int sp= 0;
        int st= num;

        for(int i=1; i<=num; i++){

            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int k=1; k<=st; k++){
                System.out.print("*\t");
            }
            System.out.println();

            sp++;
            st--;
        }
    }
}

/*

Enter a number: 5
*       *       *       *       *
        *       *       *       *
                *       *       *
                        *       *
                                *
                                
*/                               