import java.util.*;
public class To2Darray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int [][] matrix = new int[n][m];
    for(int i = 0; i<n; i++){
      for(int j = 0; j<m; j++){
        matrix[i][j] = sc.nextInt();
      }
    }
    int [] arr = new int[n*m];
    int idx = 0;
    for(int i = 0; i<n; i++){
      for(int j = 0; j<m; j++){
        arr[idx++] = matrix[n][m];
      }
    }
    for(int i = 0; i<n*m; i++){
      System.out.println("Elements of 1-D array: " + arr[i]);
    }
    sc.close();
  } 
}
