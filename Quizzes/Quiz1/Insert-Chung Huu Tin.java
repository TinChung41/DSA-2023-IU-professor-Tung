import java.util.Arrays;
import java.util.Random;
public class Insert2 {
    static int[] A = new int[20];

    public static void main(String[] args) {
        int n = 10;

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            A[i] = rand.nextInt(50) + 1; // generates random numbers between 1 and 50
        }
    
        System.out.println("Input array:");
        printArray(A, n);
    
        System.out.println("\n\nSorted array:");
        sortArray(A, n);
        printArray(A, n);
    }
    
    public static void sortArray(int[] A, int n) {
        for (int i = 1; i < n; i++) {
            int key = A[i];
            int j = i - 1;
    
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }
    
    public static void printArray(int[] A, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
