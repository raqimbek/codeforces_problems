import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var x = Integer.valueOf(new Scanner(System.in).nextLine());
    var answer = check(x);
    
    System.out.println(answer);
  }
  public static int check(int x) {
    var answer = 0;
    System.out.println("counter: " + answer);

    for (var i = 5; i >= 1; i--) {
      System.out.println("x = " + x + "; i = " + i);
      if (x > 5 && i == 1) {
        System.out.print(x + " > 5 && " + i + " == 1: ");
        System.out.println(x > 5 && i==1);
        x -= 5;
        System.out.println("5 is subtracted from " + x);
        answer++;
        System.out.println("the counter is incremented");
        System.out.println("counter: " + answer);
        answer += check(x);
        System.out.println("out of the self calling");
        System.out.println("counter: " + answer);
        break;
      }

      if (x % i == 0) {
        System.out.print(x + " % " + i + " == 0: ");
        System.out.println(x % i == 0);
        System.out.println("counter: " + answer);
        System.out.print(x + " / " + i + " (");
        System.out.print(x / i);
        System.out.println(") added to the counter");
        answer += x / i;
        System.out.println("counter: " + answer);
        break;
      }
    }

    System.out.println("out of the loop");
    System.out.println("counter: " + answer);
    return answer;
  }
}
