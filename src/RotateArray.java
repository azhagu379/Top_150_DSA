import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        rotateArray(nums, k % nums.length);
    }

    public static void rotateArray(int[] A, int k) {
        reverse(A, 0, A.length - 1);
        reverse(A, 0, k - 1);
        reverse(A, k, A.length - 1);
    }

    public static void reverse(int[] A, int from, int to) {
        while (to > from) {
            int temp = A[to];
            A[to] = A[from];
            A[from] = temp;
            from++;to--;
        }
    }
}
