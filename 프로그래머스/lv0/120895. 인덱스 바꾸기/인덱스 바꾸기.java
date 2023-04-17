class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] result = my_string.split("");
        
        for (int i = 0; i<result.length; i++){
            if (i == num1){
                answer += result[num2];
            }else if (i == num2){
                answer += result[num1];
            }else {
                answer += result[i];
            }
        }
        return answer;
    }
}