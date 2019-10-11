package algorithms.sorting_algorithms;
public class QuickSortArray extends Sortable{
    public QuickSortArray(int[] arr){
        super.arr=arr;
    }
    public void sort(){
        Sorting_Algorithms.QuickSort(super.arr);
    }
}