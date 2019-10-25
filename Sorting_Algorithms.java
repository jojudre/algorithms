package algorithms.sorting_algorithms;

public class Sorting_Algorithms {

    private static void ms(int arr[], int l, int r){
        if (l < r)
        { 
            int m = (l+r)/2; 
            ms(arr, l, m); 
            ms(arr , m+1, r); 
            merge(arr, l, m, r); 
        } 
    }
    public static void MergeSort(int arr[]){
        ms(arr,0,arr.length-1);
    }
    private static void merge(int arr[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m;   
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
        int i = 0, j = 0; 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
    public static void ShakerSort(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            boolean swapped = false;
            for (int j = i; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    swapped = true;
                }
            }
            for (int j = array.length - 2 - i; j > i; j--) {
                if (array[j] < array[j-1]) {
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
    public static void QuickSort(int arr[]){
        qs(arr,0,arr.length-1);
    }
    private static void qs(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partit(arr, begin, end);

            qs(arr, begin, partitionIndex-1);
            qs(arr, partitionIndex+1, end);
        }
    }
    private static int partit(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
    public static void InsertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int currElem = arr[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && arr[prevKey] > currElem){
                arr[prevKey+1] = arr[prevKey];
                arr[prevKey] = currElem;
                prevKey--;
            }
        }
    }
    public static void BubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}