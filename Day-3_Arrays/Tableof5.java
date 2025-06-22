import java.util.*;
public class Tableof5{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int idx = 0;
    int [] res = new int [10];
    for(int i = 1; i<=10; i++){
      res[idx++] = n*i;
    }
    System.out.println(Arrays.toString(res));
    sc.close();
  }
}