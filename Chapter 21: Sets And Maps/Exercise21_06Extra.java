import java.util.*;

public class Exercise21_06Extra{
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = input.nextLine().toLowerCase();
		
		ArrayList<Character> set = new ArrayList<>();
		for(int i = 0; i < s.length(); i++){
		    char ch = s.charAt(i);
		    if(!Character.isWhitespace(ch)){
		        set.add(ch);
		    }
		}
		
		Map<Character, Integer> map = new HashMap<>();
		for(char c : set){
		    map.put(c, Collections.frequency(set, c));
		}
		
		List<Map.Entry<Character, Integer>> last = new ArrayList<>(map.entrySet());
		Collections.sort(last, (entry1, entry2) -> {
            int compare = entry1.getValue().compareTo(entry2.getValue());
            if (compare == 0) {
                return entry1.getKey().compareTo(entry2.getKey());
            }
            return compare;
        });
		
		for(Map.Entry<Character, Integer> entry : last) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
		
	}
}
