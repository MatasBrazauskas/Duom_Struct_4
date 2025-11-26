import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        var btree = new BTree<Integer>(5);

        btree.add(1);
        btree.add(2);
        btree.add(3);
        btree.add(4);
        btree.add(5);
    }
}