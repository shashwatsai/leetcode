package in.shashwattiwari.arrays;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {

    @Test
    public void testMerge(){
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int [] numsA = {1,2,3,0,0,0};
        int [] numsB = {2,5,6};
        int m = 3, n = 3;
        mergeSortedArray.merge(numsA, m, numsB, n);
        Assert.assertArrayEquals(numsA, new int[]{1,2,2,3,5,6});
    }
}
