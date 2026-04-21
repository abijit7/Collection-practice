package hashMapp;

import java.util.HashMap;
import java.util.Map;

public class HM {
    static void main() {
        Map<Integer,String> students = new HashMap<>(8);
        //Add
        students.put(1,"Satyarth");
        students.put(2,"Rohit");
        students.put(3,"Soham");
        //get
        System.out.println(students.get(2));
        //update
        students.put(2,"Ramesh");
        System.out.println(students.get(2));
        //default value
        students.getOrDefault(4,"Not Found");
        //check existance
        boolean check = students.containsKey(3);
        System.out.println(check);
        boolean checkVakue = students.containsValue("Satyarth");
        System.out.println(checkVakue);
        //update existing value
        students.compute(1,(key,value)-> value.toUpperCase());
        System.out.println(students.get(1));
        //remove
        students.remove(2);
        System.out.println(students);
//iteration
        for(Map.Entry<Integer,String> e : students.entrySet()){
            System.out.println(e.getKey() + "----->"+e.getValue());
        }
        students.keySet().forEach(System.out::println);
        students.values().forEach(System.out::println);
        System.out.println(students.get(3).hashCode());
    }

}
