package LinkedLL;

import java.util.LinkedList;
import java.util.ListIterator;

/*Write code using LinkedList as a Queue.
Add 3 items, peek the front, poll twice,
 show remaining.*/
public class practice {
    static void main() {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Item 1");
        queue.add("Item 2");
        queue.add("Item 3");
        queue.peek();
        System.out.println("Front of the queue: " + queue.peek());
        queue.poll();
        queue.poll();
        System.out.println("Remaining items in the queue: " + queue);
    }

    /*
    Implement a browser history system using LinkedList
     that supports: visit(url), back(), forward(),
      currentPage().*/
    LinkedList<String> history = new LinkedList<>();
ListIterator<String>  cursor = history.listIterator();
String currentPage = null;
public void visit (String url){
    while (cursor.hasNext()){
        cursor.next();
        cursor.remove();
    }
    cursor.add(url);
    currentPage = cursor.previous();
    cursor.next();


    }
    public String back() {
 if (cursor.hasPrevious()) {
     currentPage = cursor.previous();
 }
 return currentPage;
    }
    public String forward(){
    if (cursor.hasNext()){
        currentPage = cursor.next();
    }
    return currentPage;
    }
public String currentPagee(){
    return currentPage;
}
}