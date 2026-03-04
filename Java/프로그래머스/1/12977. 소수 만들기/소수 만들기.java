class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length;
        for(int i = 0; i < count; i++){
            for(int j = i + 1; j < count; j++){
                for(int k = j + 1; k < count; k++){
                    int num = nums[i] + nums[j] + nums[k];
                     if (isPrime(num)) answer += 1;
                }
            }
        }
        return answer;
    }


    private boolean isPrime(int num) {
            if (num == 2) return true;

            for (int i = 2; i <= (int) Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    
}