import java.util.Iterator;
import java.util.Stack;

public class BTree<E extends Comparable<E>> implements Tree<E>
{
    public class Leaf<E extends Comparable<E>> {
        public ValArr<E> items;

        public Leaf(int order) {
            items = new ValArr<>(order);
        }
    }

    public class Node<E extends Comparable<E>> extends Leaf<E> {
        public PtrArr<Node> pointers;

        public Node(int order) {
            super(order);
            this.items = new ValArr<>(order - 1);
            this.pointers = new PtrArr<>(order);
        }
    }

    public Node root;

    public int order;
    public int height;
    public int size;

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
        Node<E> parent = null;
        Leaf<E> node = root;

        while(node != null && node instanceof Node){
            int endRangeIndex = node.items.lowerBound(item);
            var value = node.items.get(endRangeIndex);

            if(item.equals(value)){
                return;
            }

            parent = (Node<E>)node;
            node = ((Node<E>)node).pointers.get(endRangeIndex);
        }

        if(node == null){
            node = new Leaf(order);
            node.items.add(item);
            return;
        }

        if(node.items.isFull()){
            int index = order / 2;
            E median = node.items.get(index);

            Object[] arrs = node.items.split(index);

        }
    }

    public E remove(E item){
        return null;
    }

    public Iterator<E> iterator(){
        return new BTreeIterator<E>();
    }

    public void print() {
    }

    public void printLevel(int level, Leaf<E> node){

    }

    public class BTreeIterator<E> implements Iterator<E>{

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
