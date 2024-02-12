import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3,n=3;
        int[] result=merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(result));

        int[] nums={1,2,3,0,0,0};

        merge1(nums,m,nums2,n);
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1,p2=n-1,pMerge=m+n-1;
        while(p2>=0){
            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[pMerge--]=nums1[p1--];
            }
            else {
                nums1[pMerge--]=nums2[p2--];
            }
        }
        return nums1;
    }
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0, j = m; i < n; i++) {
            nums1[j] = nums2[i];
            j++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
