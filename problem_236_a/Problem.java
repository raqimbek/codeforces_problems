import java.util.Scanner;
import java.util.HashSet;

public class Problem {
  public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    HashSet<Character> inputChars = new HashSet<>();
    int indistinctCharNum = 0;

    for (int i = 0; i < input.length(); i++) {
	if (!inputChars.contains(input.charAt(i))) {
          System.out.println("set does not contain " + input.charAt(i));
          inputChars.add(input.charAt(i));
          indistinctCharNum++;
          System.out.println("indistinct characters number: " + indistinctCharNum);
          continue;
        }
        System.out.println("set does contain " + input.charAt(i));
        indistinctCharNum--;
        System.out.println("indistinct characters number: " + indistinctCharNum);
    }

    System.out.println("out of the loop");
    System.out.println("indistinct characters number: " + indistinctCharNum);
    if (indistinctCharNum%2 != 0) {
      System.out.println("CHAT WITH HER!");
    } else {
      System.out.println("IGNORE HIM!");
    }
  }
}
