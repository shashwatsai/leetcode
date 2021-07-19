package in.shashwattiwari.arrays;

import org.junit.Assert;
import org.junit.Test;

public class SquaresOfElementsTest {

    @Test
    public void testGetSquaresDuplicates(){
        int [] nums = {-7,-3,2,3,11};
        SquaresOfElements squaresOfElements = new SquaresOfElements();
        Integer[] result = squaresOfElements.squares(nums);
        Integer[] expected = new Integer[]{4,9,9,49,121};
        Assert.assertArrayEquals(expected,result);
    }

    @Test
    public void testGetSquares(){
        int [] nums = {-7,-3,2,11};
        SquaresOfElements squaresOfElements = new SquaresOfElements();
        Integer[] result = squaresOfElements.squares(nums);
        Integer[] expected = new Integer[]{4,9,49,121};
        Assert.assertArrayEquals(expected,result);
    }

    @Test
    public void testGetSquaresPrimitive(){
        int [] nums = {-7,-3,2,11};
        SquaresOfElements squaresOfElements = new SquaresOfElements();
        int[] result = squaresOfElements.squaresPrimitive(nums);
        int[] expected = new int[]{4,9,49,121};
        Assert.assertArrayEquals(expected,result);
    }
}
