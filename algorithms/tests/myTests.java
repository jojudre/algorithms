package tests;
import algorithms.*;
import org.junit.*;
public class myTests{
    static String pattern="asвfqwghazdwrqwqsfa1324asdq";
    static String tosearch="qw";
    static int[] unsorted={0,6,3,15,115,21,21,1};
    static int[] sorted={0,1,3,6,15,21,21,115};
    @Test
    public void test_MergeSort(){
        int[] actual={0,6,3,15,115,21,21,1};
        algorithms.Sorting_Algorithms.MergeSort(actual, 0, actual.length-1);
        Assert.assertArrayEquals(sorted, actual);
    }
    @Test
    public void test_ShakerSort(){
        int[] actual={0,6,3,15,115,21,21,1};
        algorithms.Sorting_Algorithms.ShakerSort(actual);
        Assert.assertArrayEquals(sorted, actual);
    }
    @Test
    public void test_SimpleSearch(){
        int expected=pattern.indexOf(tosearch);
        int actual=algorithms.String_Search_Algorithms.SimpleTextSearch(tosearch,pattern);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test_RabinKarpSearch(){
        final int expected=pattern.indexOf(tosearch);
        final int actual=algorithms.String_Search_Algorithms.RabinKarpMethod(tosearch.toCharArray(),pattern.toCharArray());
        Assert.assertEquals(expected, actual);
    }
}
