import ArrayList.Qno1;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Qno1 qn =   new Qno1();
     List<Integer>  newList =  qn.removeDuplicate(List.of(1,1,2,2,3,3,4,4,5,5,6,6));
        System.out.println(newList);
    }
}
