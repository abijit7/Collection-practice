package LinkedHashMapp;

import java.util.LinkedHashMap;
import java.util.Map;

public class intro {
    static void main() {
        Map<String , Integer> menu = new LinkedHashMap<>();
        menu.put("Burger", 500);
        menu.put("Pizza", 800);
        menu.put("Pasta", 600);
        menu.put("Salad", 400);

        //iteration in insertion order
        menu.forEach((item , price)-> System.out.println("item : "+item+" price : "+price));
    }
}
