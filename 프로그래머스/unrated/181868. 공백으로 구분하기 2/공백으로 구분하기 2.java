class Solution {
    public String[] solution(String my_string) {
        my_string = my_string.trim();
        //trim() : 단어 좌우 공백 제거
        String[] answer = my_string.split("\\s+");;
        return answer;
    }
}