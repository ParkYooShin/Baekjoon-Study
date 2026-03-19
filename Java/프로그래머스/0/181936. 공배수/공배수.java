class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        boolean a = false;
        boolean b = false;
        if(number % n == 0){
            a = !a;
        }
        if(number % m == 0){
            b = !b;
        }
        
        if(a == true && b == true){
            answer = 1;
        }
        
        return answer;
    }
}