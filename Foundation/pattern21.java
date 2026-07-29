import java.util.Scanner;
public class pattern21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();
        
        for(int i=0; i<=num; i++){
            for(int j=0; j<=num; j++){
                if(j==0 || j==num-1 || (i==j && i<= num/2) || (i+j == num-1 && i<= num/2)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }                               
            }
            System.out.println();
        }
    }
}    

/*

Enter a number: 7

 *                 *    
 *  *           *  *    
 *     *     *     *    
 *        *        *    
 *                 *    
 *                 *    
 *                 *    
 *                 *   

 */