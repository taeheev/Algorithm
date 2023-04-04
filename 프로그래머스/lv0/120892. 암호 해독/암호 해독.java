class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        //code의 배수번째 글짜만 진짜 암호..
        int a = cipher.length()/code;
        for (int i = 1; i<=a; i++){
            answer+=cipher.charAt(code*i-1);
        }
        return answer;
    }
}