import java.util.Iterator;

public interface Tree<E> {
    void clear();

    boolean contains(E item);

    void add(E item);

    E remove(E item);

    Iterator<E> iterator();
}
