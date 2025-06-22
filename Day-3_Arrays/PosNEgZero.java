import java.util.*;
public class PosNEgZero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 5;
    int [] arr = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    for(int i = 0; i<n; i++){
      if(arr[i] > 0){
        if(arr[i] % 2 == 0){
          System.out.println("Even");
        }
        else{
          System.err.println("Odd");
        }
      }
      else if(arr[i] < 0){
        System.out.println("Negative");
      }
      else if(arr[i] == 0){
        System.out.println("Zero");
      }
      sc.close();
    }
  }
}
