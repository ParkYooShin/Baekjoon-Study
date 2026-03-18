class Solution {
    public int solution(int a, int b) {
        int AB = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int BA = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        int answer = 0;
        
        if((AB > BA) || AB == BA){
            answer = AB;
        }else if(AB < BA){
            answer = BA;
        }
        
        return answer;
    }
}