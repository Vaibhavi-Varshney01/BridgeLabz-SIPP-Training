import java.util.*;
public class CanVote{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 10;
    int [] arr = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    for(int i = 0; i<n; i++){
      if(arr[i] >= 18){
        System.out.println("Can Vote.");
      }
      else if(arr[i] < 0){
        System.out.println("Invalid age.");
      }
      else{
        System.out.println("Can not Vote");
      }
    }
    sc.close();
  }
}