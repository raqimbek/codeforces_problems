import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var x = Integer.valueOf(new Scanner(System.in).nextLine());
    var answer = check(x);
    
    System.out.println(answer);
  }
  public static int check(int x) {
    var answer = 0;

    for (var i = 5; i >= 1; i--) {
      if (x > 5 && i == 1) {
        x -= 5;
        answer++;
        answer += check(x);
        break;
      }

      if (x % i == 0) {
        answer += x / i;
        break;
      }
    }

    return answer;
  }
}
