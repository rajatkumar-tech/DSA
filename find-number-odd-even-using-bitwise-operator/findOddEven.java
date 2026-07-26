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
        int n = 6;

        find(n);
    }
}