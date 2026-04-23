package hashMapp;

import java.util.HashMap;
import java.util.Map;

public class Qn {
    static void main() {
        String  str = "kathmandu";
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()){
            if (freq.containsKey(c)){
                freq.put(c, freq.get(c)+1);
            }else {
             freq.put(c,1);
            }

        }
        System.out.println(freq);
    }
}
