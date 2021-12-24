public class LinkedDeque<E> extends  LinkedQueue<E> implements Deque<E> {

    private final TwoSidedLinkedList<E> data;

    public LinkedDeque() {
        this.data = new TwoSidedLinkedListImpl<>();
    }

    @Override
    public boolean insertLeft(E value) {
        data.insertFirst(value);
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        data.insertLast(value);
        return true;
    }

    @Override
    public E removeLeft() {
        return data.removeFirst();
    }

    @Override
    public E removeRight() {
        return data.removeLast();
    }

    @Override
    public void display() {
        data.display();
    }

    @Override
    public String toString() {
        return "LinkedDeque{" +
                "data=" + data +
                '}';
    }

}
