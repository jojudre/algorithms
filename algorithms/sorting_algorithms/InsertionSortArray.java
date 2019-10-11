package algorithms.sorting_algorithms;
public class InsertionSortArray extends Sortable{
    public InsertionSortArray(int[] arr){
        super.arr=arr;
    }
    public void sort(){
        Sorting_Algorithms.InsertionSort(super.arr);
    }
}