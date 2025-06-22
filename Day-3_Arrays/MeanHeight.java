import java.util.*;
public class MeanHeight {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    double [] arr = new double[11];
    for(int i = 0; i<11; i++){
      arr[i] = sc.nextDouble();
    }
    int sum = 0;
    for(int i = 0; i<11; i++){
      sum += arr[i];
    }
    int ans = sum/11;
    System.out.println(ans);
    sc.close();
  }
  
}
