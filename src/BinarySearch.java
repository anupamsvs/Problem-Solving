public class BinarySearch {
    public static void main(String[] args) {
        int target = 9;
        int[] nums = {-1,0,3,5,9,12};

        System.out.println(findTargetBinaryS(nums, target));
    }

    private static int findTargetBinaryS(int[] nums, int target) {
        int begin = 0;
        int end = nums.length-1;
        int mid = (begin + end)/2;

        while(begin <= end){
            if(nums[mid] > target){
                end = mid -1;
            }
            else if(nums[mid] < target){
                begin = mid + 1;
            }
            else{
                return mid;
            }
            mid = (begin + end)/2;
        }
        return -1;
    }
}
