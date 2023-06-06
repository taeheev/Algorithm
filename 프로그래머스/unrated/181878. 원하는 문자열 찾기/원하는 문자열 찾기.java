class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.toUpperCase();
        String str2 = pat.toUpperCase();
        if(str.contains(str2)){
            answer = 1;
        }
        return answer;
    }
}