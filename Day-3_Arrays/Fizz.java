import java.util.*;
public class Fizz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n <= 0){
      System.out.println("Please enter the Positive no.");
    }
  String [] arr = new String[n+1];
  for(int i = 0; i<=n; i++){
    if(n%3 == 0){
      arr[i] = "Fizz";
    }
    else if(n % 5 == 0){
      arr[i] = "Buzz";
    }
    else if(n % 3 == 0 && n % 5 == 0){
      arr[i] = "FizzBuzz";
    }
    else{
      arr[i] = String.valueOf(i);
    }
  }
  System.out.println(arr);
  sc.close();
  }  
}
