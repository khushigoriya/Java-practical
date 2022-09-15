/*NAME: KHUSHI GORIYA
ID: 21CE035
AIM:The problem is to write a program that will grade multiple-choice tests.
 Assume there are eight students and ten questions, and the answers are stored 
 in a two-dimensional array. Each row records a student’s answers to the questions, 
 as shown in the following array.*/
import java.util.*;
public class pract1_8 {
    public static void main(String args[])
    {
    Scanner s= new Scanner(System.in);
    String  arr[][]=new String[8][10];
    String key[]={"D","B","D","C","C","D","A","E","A","D"};
    for (int i = 0; i < 8; i++) {
        System.out.println("Student "+(i+1));
        int count=0;
        for (int j = 0; j < 10; j++) {
            arr[i][j]= s.next();
            if(arr[i][j].equals(key[j]))
            {
                count++;
            }
        }
        System.out.println("COUNT:"+count);
    }
    
    s.close();
    }
}
