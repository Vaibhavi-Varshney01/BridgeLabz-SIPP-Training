import java.util.*;
public class Max10{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double [] arr = new double[10];
    // double total = 0.0;
    int idx = 0;
    while(true){
      double ip = sc.nextDouble();
      if(ip <= 0 || idx == 10){
        break;
      }
      arr[idx++] = ip;
    }
    int sum = 0;
    for(int i = 0; i<idx; i++){
      sum += arr[i];
    }
    System.out.println(sum);
    sc.close();
  }
}