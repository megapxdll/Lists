

public class main {

    public static void main(String[] args) {

        testLinkedQueue();
        testLinkedListStack();
        testLinkedList();
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
        linkedList.removeFirst();
        linkedList.remove(4);

        linkedList.display();
    }
}
