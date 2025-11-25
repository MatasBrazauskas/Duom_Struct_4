import java.util.Arrays;

public class ValArr<E extends Comparable<E>> implements ValueArray<E> {

    private Object[] arr;
    private int size;

    public ValArr(int size){
        arr = new Object[size];
    }

    public void clear(){
        Arrays.fill(arr, null);
        size = 0;
    }

    public boolean contains(E item){
        int index = binarySearch(item);
        return index != -1;
    }

    public boolean add(E item){
        if(size <= arr.length){
            return false;
        }
        arr[size + 1] = item;

        return true;
    }

    public E get(int index){
        if(index >= size) return null;
        return (E)arr[index];
    }

    public void insert(E item, int index){
        System.arraycopy(arr, index, arr, index + 1, size - index - 1);

        arr[index] = item;
        size++;
    }

    public E remove(int index){
        var removedItem = (E)arr[index];

        System.arraycopy(arr, index + 1, arr, index, size - index - 1);

        arr[size--] = null;
        return removedItem;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == arr.length;
    }

    public Object[] split(int index){
        var arrs = new ValArr[]{new ValArr(index), new ValArr(size - index)};

        System.arraycopy(arr, 0, arrs[0].arr, 0, index);
        System.arraycopy(arr, index, arrs[1].arr, 0, size - index);

        return arrs;
    }

    public int lowerBound(E item){
        int low = 0;
        int high = size - 1;
        int prev = high + 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int cmp = ((E)arr[mid]).compareTo(item);

            if(cmp < 0){
                low = mid + 1;
            }else {
                prev = mid;
                high = mid - 1;
            }
        }

        return prev;
    }

    public int binarySearch(E item){
        int low = 0;
        int high = size - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int cmp = ((E)arr[mid]).compareTo(item);

            if(cmp == 0){
                return mid;
            } else if(cmp < 0){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
