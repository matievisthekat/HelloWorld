import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
  public static void main(String[] args) {
    List<Integer> nums = fib(8);
    System.out.println(Arrays.toString(nums.toArray()));
  }

  private static List<Integer> fib(int n) {
    if (n == 1) {
      List<Integer> d = new ArrayList<Integer>();
      d.add(0);
      d.add(1);
      return d;
    } else {
      List<Integer> s = fib(n - 1);
      s.add(s.get(s.size() - 1) + s.get(s.size() - 2));
      return s;
    }
  }
}