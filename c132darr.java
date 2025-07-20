public class c132darr {
    
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {2, 4, 5},
            {6, 7, 8},
            {9, 10, 11}
        };

        // Replace prime numbers with 0
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (isPrime(arr[i][j])) {
                    arr[i][j] = 0;
                }
            }
        }

        // Print the updated 2D array
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
