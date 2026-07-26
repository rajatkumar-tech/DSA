import java.util.Scanner;

public class findOddEven{

    public static void find(int n ){
        int assumeBit = 1;

        if((n & assumeBit) == 0){
            System.out.println("Even Number = "+ n);
        }else{
            System.out.println("Odd Number = "+ n);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value ");
        int user = sc.nextInt();

        find( user);
    }
}