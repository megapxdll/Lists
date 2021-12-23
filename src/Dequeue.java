public class Dequeue<E> extends LinkedQueue<E> implements Queue<E>{
    @Override
    public boolean insert(E value) {
        return super.insert(value);
    }

    @Override
    public E remove() {
        return super.remove();
    }

    @Override
    public E peekFront() {
        return super.peekFront();
    }
}
