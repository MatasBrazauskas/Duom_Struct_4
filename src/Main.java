public class Main {
    public static int[] arr;

    public static int BinarySearch(int low, int high, int item){
        int prev = high + 1;
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] >= item){
                prev = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }

        return prev;
    }

    public static void main(String[] args) {

        arr = new int[]{25, 30, 33, 37};

        for(int i = 20; i < 40; i++) {
            System.out.println(i + " " + BinarySearch(0, arr.length - 1, i));
        }
    }
}