import java.util.*;
public class SumUntil0 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    while(n != 0){
      System.out.println(sum+=n);
      int m = sc.nextInt();
      n = m;
    }
    sc.close();
  }
  
}
