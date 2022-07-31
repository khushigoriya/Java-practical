//ID: 21CE035
//Name: KHUSHI GORIYA
//Aim: Implement Caesar Cipher.
import java.util.*;
public class pract1_9
{  
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
 
    public static String Encryption(String PlainText, int ShiftKey)
    {
        PlainText = PlainText.toLowerCase();
        
        String CipherText = "";
        
        for (int i = 0; i < PlainText.length(); i++)
        {
            int CharPosition = ALPHABET.indexOf(PlainText.charAt(i));
            int KeyValue = (ShiftKey + CharPosition) % 26;
            char ReplaceValue = ALPHABET.charAt(KeyValue);
            CipherText += ReplaceValue;
        }
        
        return CipherText;
    }
 
    public static String Decryption(String CipherText, int ShiftKey)
    {
        CipherText = CipherText.toLowerCase();
        
        String PlainText = "";
        
        for (int i = 0; i < CipherText.length(); i++)
        {
            int CharPosition = ALPHABET.indexOf(CipherText.charAt(i));
            int KeyValue = (CharPosition - ShiftKey) % 26;
            
            if (KeyValue < 0)
            {
                KeyValue = ALPHABET.length() + KeyValue;
            }
            
            char ReplaceValue = ALPHABET.charAt(KeyValue);
            
            PlainText += ReplaceValue;
        }
        
        return PlainText;
    }
 
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter String for Encryption : ");
        
        String Message = new String();
        Message = s.next();
        
        System.out.print("Encrypted String : ");
        System.out.println(Encryption(Message, 3));
        
        System.out.print("Decrypted String : ");
        System.out.println(Decryption(Encryption(Message, 3), 3));
        s.close();
    }
}
