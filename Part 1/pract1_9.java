//NAME: KHUSHI GORIYA
//ID: 21CE035
//CHECK SUDOKO
import java.util.*;
class pract1_9
{
    static int n = 9;
 
    static boolean IsInRange(int[][] Matrix)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(Matrix[i][j] <= 0 || Matrix[i][j] > 9)
                {
                    return false;
                }
            }
        }
        
    return true;
    }

    static boolean IsValidSudoku(int Matrix[][])
    {
        if(IsInRange(Matrix) == false)
        {
            return false;
        }
 
    boolean[] Unique = new boolean[n + 1];
 
    for(int i = 0; i < n; i++)
    {
        Arrays.fill(Unique, false);
 
        for(int j = 0; j < n; j++)
        {
            int Z = Matrix[i][j];
 
            if (Unique[Z])
            {
                return false;
            }
            
            Unique[Z] = true;
        }
    }

    for(int i = 0; i < n; i++)
    {
        Arrays.fill(Unique, false);
 
        for(int j = 0; j < n; j++)
        {
            int Z = Matrix[j][i];
 
            if (Unique[Z])
            {
                return false;
            }
            
            Unique[Z] = true;
        }
    }
 
    for(int i = 0; i < n - 2; i += 3)
    {
        for(int j = 0; j < n - 2; j += 3)
        {
            Arrays.fill(Unique, false);
 
            for(int k = 0; k < 3; k++)
            {
                for(int l = 0; l < 3; l++)
                {
                    int X = i + k;
 
                    int Y = j + l;
 
                    int Z = Matrix[X][Y];
 
                    if (Unique[Z])
                    {
                        return false;
                    }
                    
                    Unique[Z] = true;
                }
            }
        }
    }
    
    return true;
}

    public static void main(String[] args)
    {
        int[][] Matrix = {{ 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                          { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                          { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                          { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                          { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                          { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                          { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                          { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                          { 3, 4, 5, 2, 8, 6, 1, 7, 9 }};
 
        if (IsValidSudoku(Matrix))
        {
            System.out.println("The given Sudoku is Valid");
        }
        
        else
        {
            System.out.println("The given Sudoku is Not Valid");
        }
    
    }
}
 



