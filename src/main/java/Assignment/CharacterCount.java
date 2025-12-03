package Assignment;

import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String s1 = "abacadbd";
        char[] c1 = s1.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();

        for(char c : c1){
            if(hm.containsKey(c)){
                int value = hm.get(c);
                value++ ;
                hm.put(c, value);
            }
            else{
                hm.put(c,1);
            }
        }
        System.out.println(hm);
    }
}
