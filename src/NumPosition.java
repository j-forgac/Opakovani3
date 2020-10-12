import java.util.ArrayList;
import java.util.Scanner;

public class NumPosition {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        System.out.println("kolik cisel chcete zadat?");
        int amount = mySc.nextInt();
        String guessString = "";
        int guessInt;
        int checkedNum;
        String checkedString;
        mySc.nextLine();
        ArrayList<Integer> nums = new ArrayList<>();


        System.out.println("---------");
        for (int i = 1; i <= amount; i++) {
            checkedString = mySc.nextLine();
            try {
                checkedNum = Integer.parseInt(checkedString);
            } catch (java.lang.NumberFormatException e) {
                --i;
	            System.out.println("Only integers!");
                continue;
            }
            nums.add(checkedNum);
        }
        System.out.println("---------");

        while (!guessString.equals("quit")) {
            System.out.println("Input (quit to exit):");
	        guessString = mySc.nextLine();
            if (!guessString.equals("quit")) {
	            try {
		            guessInt = Integer.parseInt(guessString);
	            } catch (java.lang.NumberFormatException e) {
		            System.out.println("Only integers!");
		            continue;
	            }
                System.out.println("Output:");
	            if (nums.indexOf(guessInt) > -1){
		            System.out.println(nums.indexOf(guessInt) + 1);
	            } else {
		            System.out.println(nums.indexOf(guessInt));
	            }

            }
        }
    }
}