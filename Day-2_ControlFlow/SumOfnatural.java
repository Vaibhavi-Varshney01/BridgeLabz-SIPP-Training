import java.util.*;
public class SumOfnatural{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n >= 0){
      System.out.println("Natural Number.");
    }
    else{
      System.out.println("Not a atural Number.");
    }
    int sum = 0;
    for(int i = 0; i<=n; i++){
      sum = (n*(n+1))/2;
    }
    System.out.println(sum);
    sc.close();
  }
}