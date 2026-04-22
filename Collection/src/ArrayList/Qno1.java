/*You have a List of 1 million account IDs and need to check
 if a given ID exists 10,000 times. Why is ArrayList wrong here?
 What should you use instead? Show both approaches with code.

 */
package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Qno1 {
//Write a method that takes a List of integers and returns a new List with all duplicates removed,
// preserving original order — without using Set.
    public List<Integer> removeDuplicate(List<Integer> list) {
        return list.stream().distinct().toList();
    }

    static void main() {


        List<Integer> IDs = new ArrayList<>();
        for (int i=0; i<=1000000;i++){
            IDs.add(i);
        }
        long startTime = System.currentTimeMillis();
        int foundCount = 0;
        int target  = 999999;
        int checks = 10000;

        for (int i=0; i<checks;i++){
            //(0)n each time
            if (IDs.contains(target)){
                foundCount++;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("found"+foundCount);
        System.out.println("Time taken using Arraylist: " + (endTime - startTime) + " milliseconds");


    }

}
/*In this code, we create a List of 1
million account IDs and check if a given ID
(999999) exists 10,000 times using an ArrayList.
The contains() method of ArrayList has a time complexity of O(n),
which means it will take a long time to check for the presence of the ID in the list,
especially as the size of the list grows.*/

/* instead of using ArrayList we should use hashSet which has 0(1) complexity for conatains method */

class CorrectedQno1 {
    static void main() {

    List<Integer> IDs = new ArrayList<>();
        for (int i=0; i<=1000000;i++){
        IDs.add(i);
    }
        List<Integer> hashSetIDs = new ArrayList<>(IDs); // Convert ArrayList to HashSet for O(1) lookups
    long startTime = System.currentTimeMillis();
    int foundCount = 0;
    int target  = 999999;
    int checks = 10000;

        for (int i=0; i<checks;i++){
        //(0)n each time
        if (IDs.contains(target)){
            foundCount++;
        }
    }
    long endTime = System.currentTimeMillis();
        System.out.println("found"+foundCount);
        System.out.println("Time taken using hashset: " + (endTime - startTime) + " milliseconds");


}

}