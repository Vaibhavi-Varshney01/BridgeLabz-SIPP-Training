import java.util.*;
public class Palindrome {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		String reverse="";
		 for(int i=input.length()-1;i>=0;i--)
		 {
			reverse+=input.charAt(i); 
		 }
		 
		 if(input.equals(reverse))
		 {
			 System.out.print("It is Palindrom");
		 }
		 else
		 {
			 System.out.print("It is not Palindrom");
		 }
		 sc.close();
}

}