import java.util.Scanner;
public class pattern14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        for(int i=1; i<=10; i++){
            int val= num*i;
            System.out.println(num +" * " +i +" = " +val);
        }
    }
}

/*

Enter a number: 6
6 * 1 = 6
6 * 2 = 12
6 * 3 = 18
6 * 4 = 24
6 * 5 = 30
6 * 6 = 36
6 * 7 = 42
6 * 8 = 48
6 * 9 = 54
6 * 10 = 60

 */