class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] str1arr = str1.split("");
        String[] str2arr = str2.split("");
        for(int i = 0; i < str1arr.length; i++){
            answer += str1arr[i] + str2arr[i];
        }
        return answer;
    }
}