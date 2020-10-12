import java.util.ArrayList;
import java.util.Scanner;

public class CharAmount {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        System.out.println("zadejte text");
        String checkedString = mySc.nextLine();
        ArrayList<Character> uniqueCharArr = new ArrayList<>();
        boolean check = true;
        int counter = 0;

        for (int x = 0; x < checkedString.length(); x++) {
            if (!uniqueCharArr.contains(checkedString.charAt(x))) {
                uniqueCharArr.add(checkedString.charAt(x));
            }
        }

        for (int x = 0; x < uniqueCharArr.size(); x++) {
            counter = 0;
            for (int y = 0; y < checkedString.length(); y++) {
                if(checkedString.charAt(y) == uniqueCharArr.get(x)){
                    counter++;
                }
            }
            System.out.println(checkedString + " obsahuje " + uniqueCharArr.get(x) + " " + counter + "-krat");
        }
    }
}
