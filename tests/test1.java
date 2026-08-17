package tests;

public class test1 {

    public static void main(String args[]) {

        /*
         * //Question 1
         * 
         * In Java, what is the result of evaluating (x ^ x) for any integer x, and how
         * do x >> 1 and x >>> 1
         * differ for negative numbers?
         * 
         * 
         * A.
         * 0; x >> 1 preserves the sign bit, while x >>> 1 zero-fills the leftmost bit.
         * 
         * Correct
         * XORing any number with itself yields 0 because identical bits cancel out.
         * The signed right shift >> keeps the original sign bit (sign extension),
         * whereas the unsigned right shift >>> always fills top bits with zeros.
         * 
         * 
         */

        /*
         * 
         * Question 2
         * What is the output of executing the following Java code?
         * 
         * Java
         * 
         * 
         * String s1 = "Java";
         * String s2 = new String("Java");
         * System.out.println((s1 == s2) + " " + s1.equals(s2));
         * 
         * A.
         * false true
         * 
         * Correct
         * s1 refers to a literal in the String Constant Pool,
         * while s2 creates a new object in the general heap memory,
         * making s1 == s2 evaluate to false. However, .equals() compares actual text
         * content,
         * returning true.
         * 
         */
    }

}
