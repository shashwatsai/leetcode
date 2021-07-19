package in.shashwattiwari.arrays;

/**
 * <pre>
 *     You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 *     representing the number of elements in nums1 and nums2 respectively.
 *
 *     Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 *     The final sorted array should not be returned by the function, but instead be
 *     stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
 *     where the first m elements denote the elements that should be merged, and the
 *     last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * </pre>
 */
public class MergeSortedArray {

    /**
     * <pre>
     *     <b>Approach: </b> Since the arrays are sorted in non decreasing order, using
     *     this characteristic we can start filling the original array from the right
     *     and keep shrinking the window for matching.
     *
     *     At the end, we will be left only to fill elements from array B, if any.
     * </pre>
     *
     * @param A integer array of size m + n
     * @param m length of elements in A
     * @param B integer array fo size n
     * @param n length of elemts in B
     */
    public void merge(int[] A, int m, int[] B, int n) {
        int i=m-1;
        int j=n-1;
        int k = m+n-1;
        while(i >=0 && j>=0)
        {
            if(A[i] > B[j]){
                A[k--] = A[i--];
            } else{
                A[k--] = B[j--];
            }

        }
        while(j>=0){
            A[k--] = B[j--];
        }

    }
}
