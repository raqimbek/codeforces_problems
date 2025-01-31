import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var x = Integer.valueOf(new Scanner(System.in).nextLine());
    var answer = check(x);
    
    System.out.println(answer);
  }

  public static int check(int x) {
    var answer = 0;

    if (x > 5) {
      answer += x / 5;
      answer += check(x % 5);
    } else {
      answer++;
    }

    return answer;
  }
}
