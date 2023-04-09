class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] arr = new int[numlist.length];
        int num = 0;
        for(int i = 0; i < numlist.length; i++){
            if (numlist[i] % n == 0){
              arr[num] = numlist[i];
              num++;
            }
        }
        
        int[] answer = new int[num];
        for(int j = 0; j<num; j++){
         answer[j] = arr[j];
        }
        return answer;
    }
}