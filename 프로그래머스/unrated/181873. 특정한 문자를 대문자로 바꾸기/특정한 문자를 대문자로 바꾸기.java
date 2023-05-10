class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String result = alp.toUpperCase();
        answer = my_string.replaceAll(alp,result);
        return answer;
    }
}