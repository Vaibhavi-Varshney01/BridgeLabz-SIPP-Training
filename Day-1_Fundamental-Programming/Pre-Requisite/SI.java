import java.util.*;
public class SI {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int r = sc.nextInt();
    int t = sc.nextInt();
    int s = (p*r*t)/100;
    System.out.println(s);
    sc.close();
  }
  
}
