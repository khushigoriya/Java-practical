/**
 * NAME:KHUSHI GORIYA
 * ID:21CE035
 * Write a program that counts the occurrences of words in a text and displays the words and their occurrences in alphabetical order of the words. Using Map and Set Classes.  
 */
import java.util.*;
public class Pract7_2 {
        public static void main(String args[]) {
            String text = "Hello World!" + "Hello Students!";
            Map<String, Integer> map = new TreeMap<>();
            String[] words = text.split("[ \n\t\r.,;:!?()]");
            for(int i=0; i< words.length; i++)
            {
                String key = words[i].toLowerCase();
                if(key.length() > 0)
                {
                    if(!map.containsKey(key))
                    {
                        map.put(key, 1);
                    }
                    else
                    {
                        int value = map.get(key);
                        value++;
                        map.put(key, value);
                    }
                }
            }
            Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
            for(Map.Entry<String, Integer> entry : entrySet)
            {
                System.out.println(entry.getKey()+" - " +entry.getValue() );
            }
    }
}
