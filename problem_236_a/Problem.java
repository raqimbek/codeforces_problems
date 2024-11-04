import java.util.Scanner;
import java.util.HashSet;

public class Problem {
  public static void main(String[] a) {
    System.out.println("Please input a username. If your username contains an odd number of distinct characters, you must be a male. Otherwise you must be a female.");

    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    HashSet<Character> inputChars = new HashSet<>();
    int distinctCharNum = 0;

    for (int i = 0; i < input.length(); i++) {
	if (!inputChars.contains(input.charAt(i))) {
          System.out.println("set does not contain " + input.charAt(i));
          inputChars.add(input.charAt(i));
          distinctCharNum++;
          System.out.println("distinct characters number: " + distinctCharNum);
          continue;
        }
        System.out.println("set does contain " + input.charAt(i));
        System.out.println("distinct characters number: " + distinctCharNum);
    }

    System.out.println("out of the loop");
    System.out.println("distinct characters number: " + distinctCharNum);
    if (distinctCharNum%2 != 0) {
      System.out.println("You must be a male");
    } else {
      System.out.println("You must be a female");
    }
  }
}
