public class evenDigits {
    public static void main(String[] args) {
        
    }
    /*public int findNumbers(int[] nums) {
        int c = 0;
        for(int i : nums){
            if(i<100 && i>=10 || i>=1000 && i<10000||i==100000) c++;
        }
        return c;
    }*/
    public int findNumbers(int[] nums) {
      int count = 0;
      for(int num : nums){
        if(isEven(num)) count++;
      }  
      return count;
    }
    static boolean isEven(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0) return true;
        else return false;
    }
    static int digits(int nums){
        if(nums < 0 ) nums = nums * (-1);
        //int count = 0;
        /*while (nums>0){
            count++;
            nums = nums/10;
        }*/
        return (int) (Math.log10(nums)+1) ;
    }
    
}
