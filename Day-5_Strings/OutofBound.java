import java.util.*;
public class OutofBound{
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=10;
     int[] arr=new int[n];

     for(int i=0;i<10;i++)
     {
        arr[i]=sc.nextInt();
     }

     System.out.println(arr[10]);
    }
}