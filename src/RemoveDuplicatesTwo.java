public class RemoveDuplicatesTwo {
    public static void main(String[] args) {
    int[] nums ={1,1,1,2,2,3};

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

        int index = 1;
        int occurance = 1;

        for(int i=1; i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                occurance++;
            }else{
                occurance = 1;
            }

            if (occurance <= 2){
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

}
