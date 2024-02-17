public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={3,2,3};
        int majorityElement=majorityElement(nums);
        System.out.println(majorityElement);
    }

    public static int majorityElement(int[] nums) {
        int count = 0, maj = 0;
        for (int n : nums) {
            if (count == 0) {
                maj = n;
            }
            if (maj == n) {
                count++;
            } else {
                count--;
            }
        }
        return maj;

    }
}
