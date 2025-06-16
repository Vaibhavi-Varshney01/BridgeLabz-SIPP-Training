import java.util.*;
public class SpringSeason{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int d = sc.nextInt();
    if(m == 3 && (d > 19 && d < 32) || m == 4 && (d > 0 && d < 31) || m == 5 && (d > 0 && d < 32) || m == 6 && (d > 0 && d < 21)){
      System.out.println("It's a Spring Season.");
    }
    else{
      System.out.println("It's not Spring Season.");
    }
    sc.close();
  }
}