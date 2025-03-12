import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int[] c = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
         Arrays.sort(c);
          double median;
         int len = c.length;
         if(len%2==0){
             median = (c[len/2-1] + c[len/2]) / 2.0;
         }
         else{
            median = c[len/2];
         }
         return median;
    }
}