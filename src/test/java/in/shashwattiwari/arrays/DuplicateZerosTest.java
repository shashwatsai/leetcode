package in.shashwattiwari.arrays;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateZerosTest {

    @Test
    public void duplicateZerosTest(){
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        int [] arr = new int[] {1,0,2,3,0,4,5,0};
        duplicateZeros.duplicateZeros(arr);
        Assert.assertArrayEquals(arr, new int[] {1,0,0,2,3,0,0,4});
    }
}
