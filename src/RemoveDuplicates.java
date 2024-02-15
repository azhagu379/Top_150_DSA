public class RemoveDuplicates {
    public static void main(String[] args) {
    int[] nums ={0,0,1,1,1,2,2,3,3,4};

    int k=removeElement(nums);

        System.out.print("length ="+k+", nums=[");
    for(int i=0;i<k;i++){
        if(i<k-1){
            System.out.print(nums[i]+",");
        }
        else {
            System.out.print(nums[i]+"]");
        }

    }
    }

    private static int removeElement(int[] nums) {

        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
