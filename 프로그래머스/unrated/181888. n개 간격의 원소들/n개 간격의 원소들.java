class Solution {
    public int[] solution(int[] num_list, int n) {
        int arr = 0;
        if(num_list.length % n == 0){
            arr = num_list.length / n;
        }else{
            arr = num_list.length / n + 1;
        }
        
        int[] answer = new int[arr];
        for (int i = 0, j = 0; i < answer.length; i++){
            answer[i] = num_list[j];
            j += n;
        }
        return answer;
    }
}