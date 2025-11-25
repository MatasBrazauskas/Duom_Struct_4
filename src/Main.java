import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        /*var btree = new BTree<Integer>(5);

        btree.add(1);
        btree.add(2);
        btree.add(3);
        btree.add(4);
        btree.add(5);*/

        var arr = new int[]{1, 2, 3, 4, 5, 0};

        int index = 2;

        System.arraycopy(arr, index, arr, index + 1, arr.length - index - 1);

        for(int i : arr){
            System.out.println(i);
        }

    }
}