

public class Main
{
  public static void main(String[] args) {
    String method = args[0];
    Calculator calculator = new Calculator();
    int r = 0;

    if (method.equals("add")) {
      r = calculator.add(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
    } else if (method.equals("subtract")) {
      r = calculator.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
    } else if (method.equals("multiply")) {
      r = calculator.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
    } else if (method.equals("divide")) {
      r = calculator.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
    } else if (method.equals("fib")) {
      r= calculator.fibonacciNumberFinder(Integer.parseInt(args[1]));
    } else if (method.equals("binary")) {
      String s = calculator.intToBinaryNumber(Integer.parseInt(args[1]));
      r = Integer.parseInt(s);
    }
    System.out.println(r);
  }
}