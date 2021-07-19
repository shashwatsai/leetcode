package in.shashwattiwari.arrays;

import org.junit.Assert;
import org.junit.Test;

public class MaximumConsecutiveOnesTest {

    @Test
    public void testGetMaxConsecutiveOnes(){
        int [] nums = {1,1,0,1,1,1,1};
        MaximumConsecutiveOnes maximumConsecutiveOnes = new MaximumConsecutiveOnes();
        int result = maximumConsecutiveOnes.getMaxConsecutiveOnes(nums);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testGetMaxConsecutiveOnesTrivial(){
        int [] nums = {1};
        MaximumConsecutiveOnes maximumConsecutiveOnes = new MaximumConsecutiveOnes();
        int result = maximumConsecutiveOnes.getMaxConsecutiveOnesTrivial(nums);
        Assert.assertEquals(1, result);
    }
}
