class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int alpha = Integer.parseInt(""+a+b);
        int beta = (2 * a * b);
        if((alpha > beta)|| (alpha == beta)){
            answer = alpha;
        }else{
            answer = beta;
        }
        return answer;
    }
}