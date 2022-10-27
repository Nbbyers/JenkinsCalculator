import java.util.Scanner;

public class Main
{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String method = "";
    Calculator calculator = new Calculator();
    int r = 0;
    while (!method.equals("exit"))
    {
      System.out.println("Enter method:");
      method = sc.nextLine();
      if (method.equals("add"))
      {
        System.out.println("enter x:");
        int x = sc.nextInt();
        System.out.println("enter y:");
        int y = sc.nextInt();
        r=calculator.add(x, y);
      } else if (method.equals("subtract"))
      {
        System.out.println("enter x:");
        int x = sc.nextInt();
        System.out.println("enter y:");
        int y = sc.nextInt();
        r=calculator.subtract(x, y);
      } else if (method.equals("multiply"))
      {
        System.out.println("enter x:");
        int x = sc.nextInt();
        System.out.println("enter y:");
        int y = sc.nextInt();
        r=calculator.multiply(x, y);
      } else if (method.equals("divide"))
      {
        System.out.println("enter x:");
        int x = sc.nextInt();
        System.out.println("enter y:");
        int y = sc.nextInt();
        r=calculator.divide(x, y);
      } else if (method.equals("fib"))
      {
        System.out.println("enter x:");
        int x = sc.nextInt();
        r=calculator.fibonacciNumberFinder(x);
      } else if (method.equals("binary"))
      {
        System.out.println("enter x:");
        int x = sc.nextInt();
        String s=calculator.intToBinaryNumber(x);
        r=Integer.parseInt(s);
      }
      System.out.println(r);

    }
    System.out.println("Goodbye");
  }
}