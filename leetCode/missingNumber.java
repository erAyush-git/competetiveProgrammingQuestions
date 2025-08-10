public class missingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums) {
        int[] arr = new int[nums.length +1]; // to store element from 0 to n.
        for(int x : nums){
            arr[x] = arr[x] + 1; //same as arr[x]++
            // array indices shows the num while element shows the count 
            // one of the best methord  to solve freq related ques 
        }
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == 0) return i; // indices gives the number and zero shows it is missing.
        }
        return -1; // dummy return 
    }
}
