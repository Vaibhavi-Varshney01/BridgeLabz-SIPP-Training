import java.util.*;
public class Multiply{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[4];
    int j = 0;
    for(int i = 6; i<= 9; i++){
      arr[j++] = n*i;
    }
    System.out.println(Arrays.toString(arr));
    sc.close();
  }
}