import java.util.*;
public class Equal {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String str1=sc.next();
	String str2=sc.next();
	
	if(compare(str1,str2)==true && str1.equals(str2)==true)
		{
		System.out.print("Both  Strings are equal");
		}
	else if(compare(str1,str2)==false && str1.equals(str2)==false)
	{
		System.out.print("Both  Strings are  not equal");
	}
	else
	{
		System.out.print("Somthing is wrong");
		}
	sc.close();
}
public static Boolean compare(String str1,String str2) {
	int n=str1.length();
	int m=str2.length();
	if(n!=m)
	{
		return false;
	}
	else {
		for(int i=0;i<n;i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				return false;
			}
		}
		
	}
	
	
	return true;
}
}