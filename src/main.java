import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        LinkedListImpl<Integer> linkedList = new LinkedListImpl<>();

        for (Integer value: linkedList) {
            System.out.println("value" + value);
        }
        testLinkedDeque();
        //testLinkedQueue();
        //testLinkedListStack();
        testLinkedList();
    }

    private static void testIterator() {
        List<Integer> list = new LinkedList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }
    }
    private static void testLinkedDeque() {
        LinkedDeque<Integer> deque = new LinkedDeque<>();

        System.out.println("add element: " + deque.insertLeft(1));
        System.out.println("add element: " + deque.insertRight(9));
        System.out.println("add element: " + deque.insertLeft(2));
        System.out.println("add element: " + deque.insertRight(8));
        System.out.println("add element: " + deque.insertLeft(3));

        deque.display();
        System.out.println("remove: " + deque.removeLeft());
        System.out.println("remove: " + deque.removeRight());

    }

    private static void testLinkedQueue() {
        Queue<Integer> queue = new LinkedQueue<>();

        System.out.println("add element: " + queue.insert(34));
        System.out.println("add element: " + queue.insert(12));
        System.out.println("add element: " + queue.insert(20));
        System.out.println("add element: " + queue.insert(16));
        System.out.println("add element: " + queue.insert(14));
        System.out.println("add element: " + queue.insert(17));

        queue.display();

        System.out.println("remove: " + queue.remove());
        queue.display();
    }
    private static boolean addToStack(Stack<Integer> stack, int num) {
        if (!stack.isFull()) {
            stack.push(num);
            return true;
        }
        return false;
    }

    private static void testLinkedListStack() {
        Stack<Integer> stack = new LinkedListStack<>();

        System.out.println(addToStack(stack, 12));
        System.out.println(addToStack(stack, 16));
        System.out.println(addToStack(stack, 22));
        System.out.println(addToStack(stack, 5));
        System.out.println(addToStack(stack, 1));
        System.out.println(addToStack(stack, 32));

        stack.display();

        System.out.println("top value: " + stack.pop() );
        System.out.println("top value: " + stack.peek() );
        stack.display();
    }

    private static void testLinkedList() {
        TwoSidedLinkedList<Integer> linkedList = new TwoSidedLinkedListImpl<>();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertFirst(6);
        linkedList.insertFirst(7);
        linkedList.insertFirst(8);

        linkedList.insertLast(9);
        linkedList.insertLast(10);
        linkedList.insertLast(11);
        linkedList.insertLast(12);
        linkedList.display();

        System.out.println("Find 2: " + linkedList.contains(2));
        System.out.println("Find 1: " + linkedList.contains(1));
        System.out.println("Find 4: " + linkedList.contains(4));
        System.out.println("Find 3333: " + linkedList.contains(3333));
        System.out.println("Last item is: " + linkedList.getLast());
        linkedList.removeFirst();
        linkedList.remove(4);
        linkedList.removeLast();

        linkedList.insertLast(13);

        linkedList.display();
    }
}
