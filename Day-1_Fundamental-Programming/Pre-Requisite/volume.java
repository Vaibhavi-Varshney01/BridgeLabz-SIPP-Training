import java.util.*;
public class volume {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    float r = sc.nextFloat();
    float h = sc.nextFloat();
    float v = 3.14f * r*r * h;
    System.out.println(v);
    sc.close();
  }
  
}
