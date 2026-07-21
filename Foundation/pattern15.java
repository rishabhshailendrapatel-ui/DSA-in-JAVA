import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int sp= num/2;
        int st= 1;
        int val= 1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            int cval= val;
            for(int j=1; j<=st; j++){
                System.out.print(cval +"\t");
                if(j<=st/2){
                    cval++;
                }
                else{
                    cval--;
                }
            }
            if(i<= num/2){
                sp--;
                st+=2;
                val++;
            }
            else{
                sp++;
                st-=2;
                val--;
            }
            System.out.println();
        }
    }
}

/*

Enter a number: 5
                1
        2       3       2
3       4       5       4       3
        2       3       2
                1


STEP- 01) print simple Star pattern

                *
        *       *       *
*       *       *       *       *
        *       *       *
                *

STEP- 02) Replace stars with 1

                1
        1       1       1
1       1       1       1       1
        1       1       1
                1

STEP- 03) print same digits 

                1
        2       2       2
3       3       3       3       3
        4       4       4
                5

STEP- 04) i<= num/2 ? val++: val-- ;

                1
        2       2       2
3       3       3       3       3
        2       2       2
                1

STEP- 05) print alternate numbers

                1
        2       3       4
3       4       5       6       7
        2       3       4
                1

STEP- 06) j<= st/2 ? cval++ : cval-- ;

                1
        2       3       2
3       4       5       4       3
        2       3       2
                1
                
 */