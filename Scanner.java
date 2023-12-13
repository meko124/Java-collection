//java Scanner

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int askFirst,askSecond,answer;
        
        System.out.println("ask mumber: ");
        askFirst = scanner.nextInt();
        
        System.out.println("ask number: ");
        askSecond = scanner.nextInt();
        
        answer = askFirst + askSecond;
        System.out.println(" the summary is " + answer);
        
    }
}