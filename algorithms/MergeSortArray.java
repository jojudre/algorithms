package algorithms;
class MergeSortArray extends Sortable{
    public MergeSortArray(int[] arr){
        super.arr=arr;
    }
    public void sort(){
        Sorting_Algorithms.MergeSort(super.arr);
    }
}