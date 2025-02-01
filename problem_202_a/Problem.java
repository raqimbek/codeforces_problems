import java.util.Scanner;
import java.util.HashSet;

public class Problem {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var s = scanner.nextLine().toLowerCase();

    if (s.length() > 10 || !s.matches("^[A-Za-z]+$")) return;

    var subs = s.split("");
    var palindromes = new HashSet<String>();

    for (var start = 0; start < subs.length; start++) {
      for (var end = start + 1; end < subs.length; end++) {
        if (end - start > 1) {
          var sub1 = new StringBuilder(subs[start]);

          var prev_i = 0;

          for (var i = start + 1; i < end; i++) {
            var sub2 = "";
            if (prev_i > 0) String.join("", subs[start], subs[prev_i], subs[i], subs[end]);
            else String.join("", subs[start], subs[i], subs[end]);

            if (new StringBuilder(sub2).reverse().toString().equals(sub2)) {
              palindromes.add(sub2.toString());
            }

            sub1.append(subs[i]);
          }

          sub1.append(subs[end]);

          if (sub1.toString().equals(sub1.reverse().toString())) {
            palindromes.add(sub1.toString());
          }
        }
      }
    }
  }
}
