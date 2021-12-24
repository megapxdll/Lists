public class TwoSidedLinkedListImpl<E> extends LinkedListImpl<E> implements TwoSidedLinkedList<E> {


    protected Node<E> last;

    @Override
    public void insertFirst(E value) {
        super.insertFirst(value);
        if(size == 1) {
            last = first;
        }
    }
    @Override
    public void insertLast(E value) {
        if(isEmpty()) {
            insertFirst(value);
            return;
        }

        Node<E> newNode = new Node<>(value, null);

        last.next = newNode;
        last = newNode;
        size++;
    }

    @Override
    public E removeLast() {
        Node<E> removedNode = last;
        remove(last.item);
        return removedNode.item;
    }

    @Override
    public E removeFirst() {
        E removedValue = super.removeFirst();

        if(isEmpty()) {
            last = null;
        }

        return removedValue;
    }

    @Override
    public boolean remove(E value) {
        Node<E> current = first;
        Node<E> previous = null;

        while (current != null){
            if(current.item.equals(value)) {
                break;
            }
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        } else if(current == first) {
            removeFirst();
            return true;
        } else if (current == last) {
            last = previous;
            last.next = null;
        }

        previous.next = current.next;
        current.next = null;
        size--;

        return true;
    }

    @Override
    public E getLast() {
        return last.item;
    }

}
