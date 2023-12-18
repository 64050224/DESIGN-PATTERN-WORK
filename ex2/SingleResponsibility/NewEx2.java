//64050224
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class NewEx2 {
    public static final int MAX = 5;
    public static final int LOWER_BOUND = 0;
    public static final int UPPER_BOUND = 10;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        List<Integer> list = input();
        sort(list);
        showList(list);
    }

    private static List<Integer> input() {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 valid integers in the range ["+LOWER_BOUND+", "+UPPER_BOUND+"]");
        while (list.size() < MAX) {
            String s = sc.nextLine();
            int num;

            try {
                num = ifValid(s);
            }
            catch(Exception e){
                System.out.println("Invalid! Try again!");
                continue;
            }

            if (!isInRange(num)) {
                System.out.println("Invalid range! Try again!");
                continue;
            }

            list.add(num);
        }
        sc.close();
        return list;
    }

    private static int ifValid(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            throw nfe;
        }
    }

    private static boolean isInRange(int s) {
        return s<=UPPER_BOUND && s>=LOWER_BOUND;
    }

    private static void sort(List<Integer> list){
        Collections.sort(list);
    }

    private static void showList(List<Integer> list){
        for (int num : list){
            System.out.print(num + " ");
        }
    }
}


// print