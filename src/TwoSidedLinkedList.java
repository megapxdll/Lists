public interface TwoSidedLinkedList<E> extends LinkedList<E> {


    void insertLast(E value);


    E removeLast();
    E getLast();
}
