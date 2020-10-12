import java.util.Scanner;
import java.util.Random;

public class Average {
    public static void main(String args[]) {

        Scanner mySc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Napis kolik cisel chcete zadavat: ");
        int numberAmount = mySc.nextInt();
        double tempNum;
        double celkem = 0;

        System.out.println("cisla jsou: ");
        for (int x = 0; x < numberAmount; x++) {
            tempNum = rand.nextInt();
            System.out.println((x + 1) + ". cislo: " + tempNum);
            celkem += tempNum;
        }

        double result = celkem/numberAmount;
        System.out.println("Prumer je " + result);
    }
}