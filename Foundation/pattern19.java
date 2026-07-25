import java.util.Scanner;
public class pattern19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                if(i==1){
                    if(j==1 || j>num/2){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }  
                }
                else if(i<=num/2){
                    if(j==1 || j==num/2+1){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
                else if(i==num/2+1){
                    System.out.print(" * ");
                }
                else if(i<num){
                    if(j==num/2+1 || j==num){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
                else if(i==num){
                    if(j<=num/2+1 || j==num){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}

/*

Enter a number: 7
 *        *  *  *  * 
 *        *
 *        *
 *  *  *  *  *  *  * 
          *        *
          *        *
 *  *  *  *        *

 */