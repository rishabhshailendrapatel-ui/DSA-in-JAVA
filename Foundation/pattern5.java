import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int sp= num/2;
        int st= 1;

        for(int i=1; i<=num; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int k=1; k<=st; k++){
                System.out.print("*\t");
            }

            if(i<= num/2){
                sp--;
                st+=2;
            }
            else{
                sp++;
                st-=2;
            }
            System.out.println();
        }        
    }
}


/*

Enter a number: 5
                *
        *       *       *
*       *       *       *       *
        *       *       *
                *
                
 */