import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var x = Integer.valueOf(new Scanner(System.in).nextLine());
    var answer = x % 5 != 0 ? 
                   x % 4 != 0 ? 
                     x % 3 != 0 ?
                       x % 2 != 0 ?
                         1 : x / 2
                           : x / 3
                             : x / 4
                               : x / 5;
    System.out.println(answer);
  }
}
