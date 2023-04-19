class Solution {
    public int[] solution(long n) {
        String[] arr = String.valueOf(n).split("");
        int[] answer = new int[arr.length];
        for (int i = arr.length-1, j=0; i >= 0; i--){
          answer[j] = Integer.parseInt(arr[i]);
            j++;
        }
        return answer;
    }
}