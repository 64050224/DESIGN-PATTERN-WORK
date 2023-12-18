public class OpenCloseMain{
    static SortAlgo ALGO = new BogoSort();
    public static void main(String[] args) {
        int[] nums = {6,4,0,5,0,2,2,4};
        sort(nums);
        ALGO = new MergeSort();
        sort(nums);
        ALGO = new SelectionSort();
        sort(nums);
    }
    public static void sort(int[] arr){
        ALGO.sort(arr);
    }
}