import java.util.Scanner;
import java.util.HashSet;

public class Problem {
  public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    HashSet<Character> inputChars = new HashSet<>();

    for (int i = 0; i < input.length(); i++) {
	if (!inputChars.contains(input.charAt(i))) {
          inputChars.add(input.charAt(i));
        }
    }

    if (inputChars.size()%2 != 0) {
      System.out.println("IGNORE HIM!");
    } else {
      System.out.println("CHAT WITH HER!");
    }
  }
}
