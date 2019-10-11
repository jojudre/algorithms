package algorithms;
import algorithms.sorting_algorithms.*;
public class Main {
    public static void main(String[] args) {
        final int[] ar={0,6,3,15,115,21,21,1};
        Sortable s=new MergeSortArray(ar);
        s.sort();
        for(int i=0;i<ar.length;i++){
            System.out.print(s.getEl(i)+" ");
        }
        System.out.println();
        s=new QuickSortArray(ar);
        s.sort();
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        s=new ShakerSortArray(ar);
        s.sort();
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}