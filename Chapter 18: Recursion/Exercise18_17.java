import java.util.Scanner;

public class Exercise18_17{
  public static int count(char[] chars, char ch){
    return count(chars, ch, chars.length - 1);
  }
  
  public static int count(char[] chars, char ch, int hi){
    int count;
    if (chars[hi] == ch)
      count = 1;
    else
      count = 0;
    
    if(hi == 0)
      return count;
    else
      return count + count(chars, ch, hi - 1);
  }
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String m = input.nextLine();
    
    System.out.println("Enter a character: ");
    char n = input.next().charAt(0);
    
    char[] ar = m.replaceAll(" ", "").toCharArray();
    System.out.println(m + " appears " + count(ar, n) + " times ");
  }
  
}
