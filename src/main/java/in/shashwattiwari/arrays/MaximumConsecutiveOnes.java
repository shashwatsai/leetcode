package in.shashwattiwari.arrays;

import java.util.Arrays;

/**
 * <b>Problem statement</b>: Get maximum number of consecutive 1's in an array.
 * This class shares multiple solutions and approaches to the aforementioned problem.
 * Each method in this class implements a solution with a different approach.
 */
public class MaximumConsecutiveOnes {

    /**
     * <b>Window Concept</b>, we try to expand the window as soon as we see a 1.
     * We keep expanding currentWindow and storing the result of maxWindow.
     *
     * As soon as we see a 0, we need a new window to hold the information.
     *
     * <pre>
     * Complexity:
     *  Time Complexity : O(n), we traverse the list from beginning to end.
     *  Space Complexity : O(1)
     * </pre>
     * @param nums array of 1's and 0's
     * @return maximum length of consecutive 1's
     */
    public int getMaxConsecutiveOnes(int [] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }

        int iStart = 0;
        int iEnd = 0;

        int iCurrentSize = 0;
        int iMaxSize = 0;

        int iLen = nums.length;


        while(iEnd < iLen){
            int current = nums[iEnd];
            if(current == 1){
                iCurrentSize = (iEnd - iStart) + 1;
                iMaxSize = Math.max(iCurrentSize, iMaxSize);
                // expand the window
                iEnd++;
            }else{
                // start new window
                iEnd++;
                iStart = iEnd;
            }
        }

        return iMaxSize;
    }

    /**
     * <b>Trivial Approach</b>, from every element if it is a 1, we start a new window
     * and traverse till we see consecutive ones in an inner loop.
     *
     * Complexity:
     *  Time Complexity : O(n^2), for every element, we can at worse traverse the complete list
     *  Space Complexity : O(1)
     *
     * @param nums array of 1's and 0's
     * @return maximum length of consecutive 1's
     */
    public int getMaxConsecutiveOnesTrivial(int [] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }

        int iMaxWindow = 0;
        for(int index = 0; index < nums.length; index++){
            int iCurrWindow = 0;
            int iEnd = 0;
            if(nums[index] == 1){
                for(iEnd = index; iEnd < nums.length; iEnd++){
                    if(nums[iEnd] == 0){
                        break;
                    }
                }
                iCurrWindow = (iEnd - index);
                iMaxWindow = Math.max(iMaxWindow, iCurrWindow);
            }
        }

        return iMaxWindow;
    }
}