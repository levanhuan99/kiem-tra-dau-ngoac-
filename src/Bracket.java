import java.util.ArrayList;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        String inputString = "(s * (s – a) * (s – b) * (s – c() ";
        ArrayList<Character> arrayList = new ArrayList<Character>();

        char bracket1 = '(';
        char bracket2 = ')';


        for (int i = 0; i < inputString.length(); i++) {
            char chars = inputString.charAt(i);
            if (chars == bracket1 || chars == bracket2) {
                arrayList.add(chars);
            }
        }
        if (arrayList.size() % 2 != 0) {
            System.out.println("false");
            return;
        } else {
            ArrayList<Character> arrayList1 = Bracket.reverseArr(arrayList);

            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) == arrayList1.get(i)) {
                    System.out.println("false");
                    return;
                } else System.out.println("true");
            }

        }
    }

    public static ArrayList<Character> reverseArr(ArrayList<Character> arr) {
        ArrayList<Character> newArr = new ArrayList<Character>();
        int j = arr.size() - 1;
        for (int i = 0; i < arr.size(); i++) {
            newArr.add(i, arr.get(j));
            j--;
        }
        return newArr;
    }
}
