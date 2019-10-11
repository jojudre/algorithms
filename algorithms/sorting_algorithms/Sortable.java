package algorithms.sorting_algorithms;
public abstract class Sortable{
    protected int arr[];
    public abstract void sort();
    public int getEl(int i){
        return arr[i];
    }
}