package DSA.Algorithm;
import java.util.Arrays;
import java.util.Random;

public class Target {

    
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

  
    public static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return true;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int N = 1_000_000;  
        int[] data = new int[N];
        Random rand = new Random();

 
        for (int i = 0; i < N; i++) {
            data[i] = rand.nextInt(N * 10);
        }

        int target = data[rand.nextInt(N)]; 

         
        long start = System.nanoTime();
        boolean foundLinear = linearSearch(data, target);
        long linearTime = System.nanoTime() - start;
 
        Arrays.sort(data);

     
        start = System.nanoTime();
        boolean foundBinary = binarySearch(data, target);
        long binaryTime = System.nanoTime() - start;

        System.out.println("Target: " + target);
        System.out.println("Linear Search Found? " + foundLinear + " in " + (linearTime / 1_000_000.0) + " ms");
        System.out.println("Binary Search Found? " + foundBinary + " in " + (binaryTime / 1_000_000.0) + " ms");
    }
}
