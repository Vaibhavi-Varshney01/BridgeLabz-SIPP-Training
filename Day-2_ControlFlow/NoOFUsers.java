import java.util.*;
public class NoOFUsers{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while( n != 1){
      System.out.println("Counter " + n);
      n--;
    }
    sc.close();
  }
}