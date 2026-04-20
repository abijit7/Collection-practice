package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListt {
    static void main() {
        List<String> studenta =  new ArrayList<>();
        studenta.add("Satyarth");
        studenta.add("Rohit");
        studenta.add("Soham");
        studenta.add("Satyarth");
        studenta.add("Satyarth");
        System.out.println(studenta.get(0));
        studenta.add(3,"Ramesh");
        System.out.println(studenta);
        studenta.remove(0);
        System.out.println(studenta);
        studenta.addLast("Sere");
        System.out.println(studenta);
        studenta.remove("Satyarth");
        System.out.println(studenta);
        Collections.sort(studenta);
        for(String s: studenta){
            System.out.println(s);
        }
        studenta.stream().filter(s -> s.startsWith("S")).forEach(System.out::println);
    }

}
