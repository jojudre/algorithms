package algorithms.sorting_algorithms;
public class BubbleSortArray extends Sortable{
    public BubbleSortArray(int[] arr){
        super.arr=arr;
    }
    public void sort(){
        Sorting_Algorithms.BubbleSort(super.arr);
    }
}