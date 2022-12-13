
import java.util.Scanner;


public class main {


    public static void main(String[] args) {
        char c;
        int asci;
        Scanner scan = new Scanner(System.in);
        System.out.print(" please Enter a Character: ");
        c = scan.next().charAt(0);
        asci= c;
        System.out.println(asci);
    }
}