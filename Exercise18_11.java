import java.util.Scanner;

public class Exercise18_11{
  public static int sumDigits(long n){
    int a = 0;
    if (n== 0)
      return 0;
    else
      a += n % 10 + sumDigits(n/10);
    return a ;
  }
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int m = input.nextInt();
    
    System.out.println("The sum of digits in " + m + " is " + sumDigits(m));
  }
  
}
