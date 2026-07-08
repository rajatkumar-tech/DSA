
// this code is more advance to O(n) time complexity
public class modificationSumofVariable {

    public static int sum(int arr[]) {
        int n = arr.length;
        int totalSum = 0;

        // create new array to store the values

        int prefix[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            // store the new variables in the new array
            prefix[i + 1] = prefix[i] + arr[i];
        }

        for (int i = 0; i < n; i++) {

            // find the largest and store start variable
            int start = Math.max(0, i - arr[i]);
            // store the current sum
            int currSum = prefix[i+1] - prefix[start];

            totalSum = totalSum + currSum;
        }

        return totalSum;
    }

    public static void main(String args[]) {
        int arr[] = { 6, 2, 4, 1 };

        System.out.println(sum(arr));
    }
}
