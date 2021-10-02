import java.util.*;
public class Flip {
    public static int getFlipsCount(String s) {
        int result = 0;
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = Integer.valueOf(s.charAt(i) + "");
        }
        for (int i = 0; i < arr.length; i++) {
            result += (result % 2) ^ arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int answer = getFlipsCount(s);
        System.out.println(answer);
    }
}
