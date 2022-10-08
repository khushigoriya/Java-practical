/**
 * NAME:KHUSHI GORIYA
 * ID:21CE035
 * Create a generic method for sorting an array of Comparable objects. 
 */
public class Pract7_1 {
    public static void main(String[] args) 
    {
        Integer[] intArray = {3,5,2,1,0,6,4};
        Double[] doubleArray = {3.1, 5.6, 1.2, 4.5, 2.4};
        Character[] characterArray = {'B', 'D', 'E', 'C', 'A'};
        sort(intArray);
        sort(doubleArray);
        sort(characterArray);
        System.out.print("Sorted integer: ");
        printList(intArray);
        System.out.print("Sorted double: ");
        printList(doubleArray);
        System.out.print("Sorted character: ");
        printList(characterArray);         
    }   
    
    public static <M extends Comparable<M>> void sort(M[] list)
    {
        M currentMin;
        int currentMinIndex;
        for(int i=0; i< list.length - 1; i++)
        {
            currentMin = list[i];
            currentMinIndex = i;
            for(int j = i+1; j<list.length; j++)
            {
                if(currentMin.compareTo(list[j]) > 0)
                {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if(currentMinIndex != i)
            {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    public static void printList(Object[] list) 
    {
        for(int i=0; i<list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}

