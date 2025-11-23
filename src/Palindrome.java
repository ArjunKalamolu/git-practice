package src;
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = input.nextLine();
        System.out.println(isPalindrome(name));

    }
    static boolean isPalindrome(String name){
        if(name.length() == 0){
            return true;
        }
        
        char[] ch = name.toCharArray();
        int i = 0;
        int j = name.length()-1;
        while(i < j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String result = new String(ch);
       if(result.equals(name)){
        return true;
       }
    return false;   
    
}
    
}
