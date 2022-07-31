import java.util.*;
public class pract1_5{
    static public int stringMatch(String a, String b) {
    int len = Math.min(a.length(), b.length());
    int count = 0;
    for (int i = 0; i < (len-1); i++){
        String a1 = a.substring(i, i+2);
        String b1 = b.substring(i, i+2);
        if (a1.equals(b1))
        {
            count++;
        } 
    }
    return count;
    }
        
    public static void main(String args[])
    {
    Scanner s= new Scanner(System.in);
    String s1=new String();
    String s2=new String();
    s1=s.nextLine();
    s2=s.nextLine();
    int ans=stringMatch(s1,s2);
    System.out.println(ans);
    s.close();
    }
}
