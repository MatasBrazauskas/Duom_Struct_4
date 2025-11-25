import java.util.Iterator;

public class BTree<E extends Comparable<E>> implements Tree<E>
{
    private class Leaf<E extends Comparable<E>> {
        public ValArr<E> items;

        public Leaf(int order) {
            items = new ValArr<>(order);
        }
    }

    private class Node<E extends Comparable<E>> extends Leaf<E> {
        public PtrArr<Node> pointers;

        public Node(int order) {
            super(order);
            this.items = new ValArr<>(order - 1);
            this.pointers = new PtrArr<>(order);
        }
    }

    private Node root;

    private int order;
    private int height;
    private int size;

    public BTree(int order) {
        this.root = new Node(order);
        this.height = 1;
        this.order = order;
    }

    public void clear(){

    }

    public boolean contains(E item){
        return false;
    }

    public void add(E item){
        Leaf<E> node = root;

        while(node instanceof Node){
            int endRangeIndex = node.items.lowerBound(item);
            var value = node.items.get(endRangeIndex);

            if(item.equals(value)){
                return;
            }

            node = ((Node<E>)node).pointers.get(endRangeIndex);
        }

        

    }

    public E remove(E item){
        return null;
    }

    public Iterator<E> iterator(){
        return new BTreeIterator<E>();
    }

    private class BTreeIterator<E> implements Iterator<E>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }

        @Override public void remove() {

        }
    }
}
