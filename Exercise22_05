import java.util.*;

public class Exercise22_05{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a series of numbers ending with 0: ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(input.hasNextInt()){
            list.add(input.nextInt());
        }
        
        int dex = 0;
        int mcount = 0;
        int match = -1;
        int count = 1;
        
        for (int i = 1; i < list.size(); i++){ //Collections.frequency(
            
            if (list.get(i-1) == list.get(i)){
                count++;
                if (count >= mcount){
                    mcount = count;
                    if(match != list.get(i)){
                        match = list.get(i);
                        if(dex < i-1){
                            dex = i-1;
                        }
                    }
                }
            }else{
                count = 1;
            }
        }
        
        System.out.println("The longest same number sequence starts at index " + dex + " with " + mcount + " values of " + match);
    }
}
