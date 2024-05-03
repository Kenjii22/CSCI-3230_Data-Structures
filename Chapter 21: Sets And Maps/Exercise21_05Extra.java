import java.util.*;

public class Exercise21_05Extra
{
	public static void main (String[]args)
  {
	Scanner input = new Scanner (System.in);
    System.out.print ("Enter strings for the first set: ");
    String[] set1 = input.nextLine().split("\\s+");
	TreeSet < String > s1 = new TreeSet <> (Arrays.asList(set1));
	//System.out.println (s1.toString());

	System.out.print ("Enter strings for the second set: ");
	String[] set2 = input.nextLine().split("\\s+");
	TreeSet < String > s2 = new TreeSet <> (Arrays.asList(set2));
	//System.out.println (s2);
	
	System.out.println("The union of the two sets is " + union(s1, s2));

	System.out.println("The difference of the two sets is " + differ(s1, s2));

	System.out.println("The intersection of the two sets is " + inter(s1, s2));
  }

    public static String union(TreeSet one, TreeSet two){
        TreeSet<String> un = new TreeSet(one);
        un.addAll(two);
        return un.toString();
     }

     public static String differ(TreeSet one, TreeSet two){
        TreeSet<String> dif = new TreeSet(one);
        dif.removeAll(two);
        return dif.toString();
     }

     public static String inter(TreeSet one, TreeSet two){
        TreeSet<String> sec = new TreeSet(one);
        sec.retainAll(two);
        return sec.toString();
     }
}
