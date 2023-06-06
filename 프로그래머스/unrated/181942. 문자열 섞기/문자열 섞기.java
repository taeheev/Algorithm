class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] str11 = str1.split("");
        String[] str22 = str2.split("");
        for(int i = 0; i < str11.length; i++){
            answer += str11[i] + str22[i];
        }
        return answer;
    }
}