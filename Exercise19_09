import java.util.ArrayList;
import java.util.Scanner;

public class Exercise19_09{
	public static <E extends Comparable<E>>
			void sort(ArrayList<E> list) {
		E cur;
		int in;

		for (int i = 0; i < list.size() - 1; i++) {
			cur = list.get(i);
			in = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (cur.compareTo(list.get(j)) > 0) {
					cur = list.get(j);
					in = j;
				}
			}

			if (in != i) {
				list.set(in, list.get(i));
				list.set(i, cur);
			}
		}
	}
	
	public static void main(String[] args) {
			  Scanner inp = new Scanner(System.in);
			  ArrayList<Integer> list = new ArrayList<>();
			  
			  System.out.println("Enter 10 integers: ");
			  
			  for(int i = 0; i < 10; i++ ){
			    list.add(inp.nextInt());
			  }
			  
			  sort(list);
			  System.out.print("The sorted numbers are " + list.toString());
			}
}
