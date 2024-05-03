import java.util.*;

public class Exercise22_03{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string s1: ");
        String s1 = input.nextLine();
    
        System.out.print("Enter a string s2: ");
        String s2 = input.nextLine();
    
        int dex = -1;
        int match = 0;
    
        for (int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(0) && match == 0){
                dex = i;
                match++;
            } else if(s1.charAt(i) == s2.charAt(match)){
                match++;
            } else{
                match = 0;
                dex = -1;
            }
        
            if(match == s2.length()){
                break;
            }
        }
    
        if(dex >1)
            System.out.println("matched ar index " + dex);
        else
            System.out.println("No match ");
    }
}
