import java.util.*;
public class Simple{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100");
        int n = input.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + "*" + i+"="+ n*i);
        }
    }
}