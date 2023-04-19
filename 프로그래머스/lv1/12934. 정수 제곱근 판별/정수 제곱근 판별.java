class Solution {
    public long solution(long n) {
        long answer = 0;
        long result = (long)Math.sqrt(n);
        long x = (long)Math.pow(result+1,2);
        if (n % Math.sqrt(n) == 0){
            answer = (long)x;
        }else{
            answer = -1;
        }
        return answer;
    }
}