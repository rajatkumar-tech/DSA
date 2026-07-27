import java.util.Scanner;

public class findOddEvenOptimized {

    // build the boolean funtion 
    public static boolean findOddEven(int n){
        return (n & 1) == 0;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int number = sc.nextInt();

        if(findOddEven(number)){
            System.out.println("Even Number is = "+number);
        }else{
            System.out.println("odd Number = "+ number);
        }

        sc.close(); 

    }
    
}
