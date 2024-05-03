import java.util.Scanner;

public class Exercise19_05{
  public static <E extends Comparable<E>> E max (E[] list){
    E max = list[0];
    for(int i = 1; i < list.length; i++){
      E comp = list[i];
      if (comp.compareTo(max) > 0)
        max = comp;
    }
    
    return max;
  }
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Integer[] list = new Integer[10];
    
    System.out.println("Enter 10 integers: ");
    for(int i = 0; i < list.length; i++){
      list[i] = in.nextInt();
    }
    
    System.out.println("The max number is " + max(list));
  }
}
