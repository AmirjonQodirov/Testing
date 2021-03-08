import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.Random;

public class SortingTest {

    @Test
    public void testDefaultArr(){
        int[] arr = new int[100];
        System.out.println("Default Items(" + arr.length +" elements)");
        Random rd = new Random();
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt();
        }
        Assert.assertArrayEquals(InsertionSort.sortArray(arr), Arrays.stream(arr).sorted().toArray());
    }

    @Test
    public void testOnSortingArr(){
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Sorting arr(" + arr.length +" elements)");
        Assert.assertArrayEquals(InsertionSort.sortArray(arr),arr);
    }

    @Test
    public void testOnReverseSortingArr(){
        int[] arr = {7,6,5,4,3,2,1,-1};
        System.out.println("Reverse sorting arr(" + arr.length +" elements)");
        Assert.assertArrayEquals(InsertionSort.sortArray(arr), Arrays.stream(arr).sorted().toArray());
    }

    @Test
    public void testOnNull(){
        System.out.println("Null test \n");
        Assert.assertNull(InsertionSort.sortArray(null));
    }

    @Test
    public void testOnEmptyArr(){
        int[] arr = {};
        System.out.println("Empty");
        Assert.assertArrayEquals(InsertionSort.sortArray(arr), arr);
    }

    @Test
    public void testEqualItemsBeside1(){
        int[] arr = {1,1,1,6,1,1,1};
        System.out.println("Equal Items beside 1item (" + arr.length +" elements)");
        Assert.assertArrayEquals(InsertionSort.sortArray(arr), Arrays.stream(arr).sorted().toArray());
    }

}
