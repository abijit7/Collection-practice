import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapp {
    public static void main(String[] args){
        TreeMap<String , Integer> result= new TreeMap<>();
        result.put("Abijit",90);
        result.put("Sourav",80);
        result.put("Gourav",85);
        result.put("Harsh",95);
        result.put("Mohit",75);
        result.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("-----------------------------");
        result.headMap("Mohit").forEach((k,v)-> System.out.println(k+" "+v));

    }

}
