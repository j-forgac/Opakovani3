import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;

public class Median {
    public static void main(String args[]) {

        Scanner mySc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Napis kolik cisel chcete zadavat: ");
        int numberAmount = mySc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        int tempNum;
        double firstNum;
        double secondNum;
        double median;
        for (int x = 0; x < numberAmount; x++) {
            tempNum = rand.nextInt();
            System.out.println(+ (x + 1) + ". cislo je " + tempNum);
            numbers.add(tempNum);
        }

        Collections.sort(numbers);

        if (numberAmount % 2 == 1) {
            System.out.println("Median je:" + numbers.get((int) ((numberAmount / 2) + 0.5)));
        } else {
            firstNum = numbers.get(numberAmount/2 - 1);
            secondNum = numbers.get((numberAmount/2));
            median = (firstNum + secondNum)/2;
            System.out.println("Median je: " + median);
        }

    }
}
