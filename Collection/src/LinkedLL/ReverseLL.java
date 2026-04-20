package LinkedLL;

import java.util.LinkedList;

public class ReverseLL {
    static void main() {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        for (int i = numbers.size()-1 ; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
