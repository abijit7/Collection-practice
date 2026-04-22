package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    static void main() {

        List<Account> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        students.add(new Account(1, "Satyarth", 90.5));
        students.add(new Account(2, "Rohit", 85.0));
        students.add(new Account(3, "Soham", 92.0));
        System.out.println("Enter student ID to search:");
        int idSearch = scanner.nextInt();
        boolean found = false;
        for (Account student : students) {
            if (student.getId() == idSearch) {
                found = true;
                System.out.println("before" + student);
                System.out.println("Enter new name for the student:");
                student.name = scanner.next();
                System.out.println("after" + student);
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        int removeid = scanner.nextInt();
        students.removeIf(s -> s.getId() == removeid);

    }

}