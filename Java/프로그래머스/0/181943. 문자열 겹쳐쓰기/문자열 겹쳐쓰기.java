class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        answer = change(answer, my_string, overwrite_string, s);
        
        return answer;
    }
    
    //값이 들어오면 replace 함수로 대체 ... 특정 값에서 ~ 길이 만큼!s
    public String change(String answer,String my_string, String overwrite_string, int s){
        for(int i=0; i<s; i++){
            answer += my_string.charAt(i);
        }
        int j = 0;
        while(j<overwrite_string.length()){
            answer += overwrite_string.charAt(j);
            j++;
        }
        int k = j+s;
        while(k<my_string.length()){
            answer += my_string.charAt(k);
            k++;
        }
        return answer;
    }
}