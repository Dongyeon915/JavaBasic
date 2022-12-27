import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class List1227 {

  public static void main(String[] args) {
    /*List<Integer> list = new ArrayList<>(10);
    list.add(new Integer(5));
    list.add(new Integer(4));
    list.add(new Integer(3));
    list.add(new Integer(2));
    list.add(new Integer(1));

    List<Integer> list1 = new ArrayList<>(list.subList(1,4));
    System.out.println(list);
    System.out.println(list1);

    Collections.sort(list);
    Collections.sort(list1);
    System.out.println(list);
    System.out.println(list1);

    System.out.println(list.containsAll(list1));
    System.out.println(list.retainAll(list1));
    System.out.println(list);
*/
    List<Integer> num1 = new ArrayList<>(100);
    for (int i = 0; i <= 101; i++) {
      num1.add(i);
    }
    System.out.println(num1);

    List<Integer> num2 = new LinkedList<>(num1);
    System.out.println(num2);
    Iterator<Integer> iterator = num2.iterator();
    while (iterator.hasNext()) {
      Integer a = iterator.next();
      System.out.println(a);
    }
    Scanner scanner = new Scanner(System.in);
    Queue<Integer> integers = new LinkedList<>();
    for (int i = 0; i < 5; i++) {
      integers.add(scanner.nextInt());
    }
    System.out.println(integers);

    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < 10; i++) {
      stack.push(i);
    }
    for (Integer a : stack){
      System.out.println(a);
    }



  }
}

