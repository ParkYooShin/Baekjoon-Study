class Solution {
    public int solution(int n) {
        int answer = 0;
        int size = 0;
        
        boolean odd = true;
        
        if(n % 2 ==0) odd = !odd;
        
        for(int i = 1; i <= n; i++){
           if(!odd){
               if(i  % 2 == 0){
                   size += (i * i);
               }
           }else{
               if(i % 2 != 0){
                   size += i;
               }
           }
        }
        
        return size;
    }
}