package in.shashwattiwari.arrays;

/**
 *  <b>Problem Statement</b>: Given an array of integer, duplicate each 0 to its next position.
 *  For example input array [1,0,2,3,0,4,5,0], input array must become [1,0,0,2,3,0,0,4]
 */
public class DuplicateZeros {

    /**
     * <b>Approach</b> This solution requires a simple approach of inserting an item in an array.
     * We start from the right till that index, and shift arr[i+1] = arr[i]
     *
     * <pre>
     * Complexity:
     *  Time Complexity: O(n^2) for each element which is 0, we shift the remaining n-1 element to the right.
     *  Space Complexity: O(n)
     * </pre>
     * @param arr array of integer with 0s and other integers
     */
    public void duplicateZeros(int[] arr) {
        int iLen = arr.length;
        for(int i = iLen-1; i >=0; i--){
            if(arr[i] == 0){
                for(int end = iLen-2; end >= i+1; end--){
                    arr[end+1] = arr[end];
                }
                if(i+1 < iLen-1){
                    arr[i+1] = 0;
                }
            }
        }
    }
}
