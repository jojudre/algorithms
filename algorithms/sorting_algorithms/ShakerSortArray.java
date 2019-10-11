package algorithms.sorting_algorithms;
public class ShakerSortArray extends Sortable{
    public ShakerSortArray(int[] arr){
        super.arr=arr;
    }
    public void sort(){
        Sorting_Algorithms.ShakerSort(super.arr);
    }
}