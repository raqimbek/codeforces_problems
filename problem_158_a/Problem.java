import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    

    try {
      List<Integer> inputNums;
      inputNums = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::valueOf)
                        .toList();

      var n = inputNums.get(0);
      var k = inputNums.get(1);

      if (n < 1 && n > 50 && k > n) return;

      var passedParticipantsNum = 0L;

      var scores = Arrays.stream(scanner.nextLine().split(" "))
                         .map(Integer::valueOf)
                         .toList();

      var kth = scores.get(k);

      System.out.println("Debugging...");
      System.out.print("scores list: ");
      System.out.println(scores);
      System.out.print("k = ");
      System.out.println(k);
      System.out.print("kth = ");
      System.out.println(kth);
      passedParticipantsNum = scores.stream().filter(score -> {System.out.print("score > 0: "); System.out.println(score > 0); System.out.print("score >= kth: "); System.out.println(score >= kth); return score > 0 && score >= kth;}).peek(score -> {System.out.print("score: "); System.out.println(score);}).count();

      System.out.println(passedParticipantsNum);
    } catch(NumberFormatException e) {
      System.out.println("Only integer numbers are allowed as an input");
    }
  }
}
