package LinkedHashMapp;

import java.util.LinkedHashMap;
import java.util.Map;

public class LURcache {
    static void main() {
        Map<String,Integer> cache = new LinkedHashMap<>(3,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<String , Integer> eldest){
                return size() > 3;
            }
        };
        cache.put("A",1);
        cache.put("B",2);
        cache.put("C",3);
        System.out.println(cache);
        cache.put("D",4);
        System.out.println("after 4 entries"+cache);
    }
}
