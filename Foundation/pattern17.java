import java.util.Scanner;
public class pattern17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int sp= num/2;
        int st= 1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=sp; j++){
                if(i==(num/2)+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }
            if(i<=num/2){
                st++;
            }
            else{
                st--;
            }
            System.out.println();
        }
    }
}

/*

Enter a number: 7
                        *
                        *       *
                        *       *       *
*       *       *       *       *       *       *
                        *       *       *
                        *       *
                        *



public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num= sc.nextInt();

        int sp= num/2;
        int st= 1;
        for(int i=1; i<=num; i++){
            if(i==(num/2)+1){
                sp= 0;
                st= num;
            }
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }                      
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }
            if(i==(num/2)+1){
                sp= num/2;
                st= num-(num/2);
            }
            if(i<=(num/2)){
                st++;
            }else{
                st--;
            }            
            System.out.println();
        }        
    }

*/