import java.util.Scanner;

public class practice {

    
    public static int getIthBit(int n , int i ){
        int value = n <<i;
        if((n & value) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i ){
        int value = 1 << i;
        return n | value;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("print the first Value");
        int n = sc.nextInt();

        System.out.println("Enter the Second value");
        int i = sc.nextInt();

        System.out.println("output = "+ getIthBit(n, i));
        System.out.println(setIthBit(n, i));
    }
}