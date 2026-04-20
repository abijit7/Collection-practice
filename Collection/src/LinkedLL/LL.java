package LinkedLL;

import java.util.LinkedList;
import java.util.Scanner;

public class LL {
    static void main() {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        for (Integer num : numbers) {
            if (num == 3) {
                System.out.println(numbers.indexOf(num));
            }
        }
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> choice = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            int value = scanner.nextInt();
            choice.add(value);

        }
        System.out.println(choice);
       choice.removeIf(n -> n >25);
        System.out.println(choice);


    }

        }


