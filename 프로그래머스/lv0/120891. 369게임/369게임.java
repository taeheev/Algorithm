class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] arr = Integer.toString(order).split("");
        for(int i = 0; i<arr.length; i++){
          if(Integer.parseInt(arr[i]) != 0){
            if(Integer.parseInt(arr[i]) % 3 == 0 ) {
                answer++;
            }
          }
        }
        return answer;
    }
}