import java.util.*;
public class IsFirstSmallest {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    boolean flag = false;
    if(a < b && a < c){
      flag = true;
      System.out.println(flag);
    }
    else{
      flag = false;
      System.out.println(flag);
    }
    sc.close();


  }
  
}
