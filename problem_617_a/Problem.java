import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {
    var x = Integer.valueOf(new Scanner(System.in).nextLine());
    var answer = check(x);
    
    System.out.println(answer);
  }
  public static int check(int x) {
    var answer = 0;
    if (x % 5 != 0) {
      if (x % 4 != 0) {
        if (x % 3 != 0) {
          if (x % 2 != 0) {
            if (x != 1) {
              answer++;
              x -= 5;
              answer += check(x);
            } else {
              answer = 1;
            }
          } else {
            answer = x / 2;
          }
        } else {
          answer = x / 3;
        }
      } else {
        answer = x / 4;
      }
    } else {
     answer = x / 5;
    }
    return answer;
  }
}
