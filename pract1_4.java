import java.util.*;
public class pract1_4 {
    static public void array123(int[] a)
    {
        int flag=0;
        for(int i=0;i<(a.length-2);i++)
        {
            if(a[i]==1 && a[i+1]==2 && a[i+2]==3)
            {
                flag=1;
                break;
            }
            else{
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println(true);
        }
        else
        System.out.println(false);
    }
    
   public static void main(String args[])
   {
   Scanner s= new Scanner(System.in);
   System.out.println("Enter n:");
   int n=s.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
    arr[i]=s.nextInt();
   }
   array123(arr);
   s.close();
   }

}
