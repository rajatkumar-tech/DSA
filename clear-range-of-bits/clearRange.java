// package clear-range-of-bits;

public class clearRange {
    public static int clear(int n , int i, int j){
        int a = ((~0) << (j+1));
        int b = (1 << i)-1;
        int bitmarks = a |b ;
        return n & bitmarks;
    }

    public static void main(String args[]){
        System.out.println(clear(10, 2, 4));
    }
}
