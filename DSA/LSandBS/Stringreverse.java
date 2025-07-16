package DSA.LSandBS;
public class Stringreverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");    
        sb.insert(5, ",");      
        sb.replace(0, 5, "Hi"); 
        sb.delete(3, 4);        
        sb.reverse();           

        System.out.println(sb);
    }
}
