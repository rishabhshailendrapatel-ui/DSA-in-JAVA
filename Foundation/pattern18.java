import java.util.Scanner;
public class pattern18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int sp= 0;
        int st= num;

        for(int i=1; i<=num; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=st; j++){
                if(i>1 && i<=num/2 && j>1 && j<st){
                    System.out.print("   ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            if(i<=num/2){
                sp++;
                st-=2;
            }
            else{
                sp--;
                st+=2;
            }            
            System.out.println();
        }
    }
}

/*

Enter a number: 9
 *  *  *  *  *  *  *  *  * 
    *                 *
       *           *
          *     *
             *
          *  *  *
       *  *  *  *  *
    *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *

 */